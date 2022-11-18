package com.todo.todospring.domain;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
@ToString
@Getter
@Setter
public class TodoDTO {

    private long index;
    private String todo;
    private String dueDate;
    private boolean finished;

}
