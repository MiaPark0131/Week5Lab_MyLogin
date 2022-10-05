/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import managers.AccountService;
import models.User;

/**
 *
 * @author meeye
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        
        if (logout != null) {
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "You have successfully logged out.");
        }
        
        User user = (User) session.getAttribute("user");
        
        if (user != null)   {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new AccountService().login(username, password);
        
        if (username == null || password == null || user == null)   {
            
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("message", "Invalid input. Please try again.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

        session.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);


    }

}
