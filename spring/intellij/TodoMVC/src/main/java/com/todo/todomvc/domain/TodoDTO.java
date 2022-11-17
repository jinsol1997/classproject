package com.todo.todomvc.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TodoDTO {

    private long index;
    private String todo;
    private String dueDate;
    private boolean finished;

}
