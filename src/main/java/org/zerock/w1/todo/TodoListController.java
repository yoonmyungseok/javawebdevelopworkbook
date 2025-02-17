package org.zerock.w1.todo;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 1. ClassName     : TodoListController
 * 2. FileName      : TodoListController.java
 * 3. Package       : org.zerock.w1.todo
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 13. 오전 10:34
 * 6. Comment       :
 */
@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list");
        
        List<TodoDTO> dtoList= TodoService.INSTANCE.getList();
        
        req.setAttribute("list", dtoList);
        
        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req, resp);
    }
}
