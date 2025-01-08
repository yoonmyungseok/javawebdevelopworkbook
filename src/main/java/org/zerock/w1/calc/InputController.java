package org.zerock.w1.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1. ClassName     : InputController
 * 2. FileName      : InputController.java
 * 3. Package       : org.zerock.w1.calc
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 1. 2. 오후 1:39
 * 6. Comment       :
 */
@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("InputController...doGet...");
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");
        
        dispatcher.forward(req,resp);
    }
}
