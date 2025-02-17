package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1. ClassName     : TodoService
 * 2. FileName      : TodoService.java
 * 3. Package       : org.zerock.w1.todo.service
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 14. 오후 3:56
 * 6. Comment       :
 */
public enum TodoService {
    INSTANCE;
    
    public void register(TodoDTO todoDTO) {
        
        System.out.println("DEBUG....." + todoDTO);
    }
    
    public List<TodoDTO> getList() {
        
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i->{
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo..."+i);
            dto.setDueDate(LocalDate.now());
            
            return dto;
        }).collect(Collectors.toList());
        
        return todoDTOS;
    }
    
    public TodoDTO get(Long tno) {
        
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);
        
        return dto;
    }
}
