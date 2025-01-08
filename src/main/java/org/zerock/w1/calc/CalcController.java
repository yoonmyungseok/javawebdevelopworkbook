package org.zerock.w1.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1. ClassName     : CalcController
 * 2. FileName      : CalcController.java
 * 3. Package       : org.zerock.w1.calc
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 1. 2. 오후 2:20
 * 6. Comment       :
 */
@WebServlet(name = "CalcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        
        System.out.printf("num1: %s", num1);
        System.out.printf("num2: %s", num2);
        
        resp.sendRedirect("/index");
    }
}
