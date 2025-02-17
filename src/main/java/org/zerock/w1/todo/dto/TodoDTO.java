package org.zerock.w1.todo.dto;

import java.time.LocalDate;

/**
 * 1. ClassName     : TodoDTO
 * 2. FileName      : TodoDTO.java
 * 3. Package       : org.zerock.w1.todo.dto
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 14. 오전 9:58
 * 6. Comment       :
 */
public class TodoDTO {
    
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    
    public Long getTno() {
        return tno;
    }
    
    public void setTno(Long tno) {
        this.tno = tno;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    public boolean isFinished() {
        return finished;
    }
    
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    
    @Override
    public String toString() {
        return "TodoDTO{" +
            "tno=" + tno +
            ", title='" + title + '\'' +
            ", dueDate=" + dueDate +
            ", finished=" + finished +
            '}';
    }
}
