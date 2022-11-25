package com.todo.todospring.domain;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
@ToString
@Getter
@Setter
public class TodoDTO {

    @Positive
    private long todoindex;

    @NotEmpty
    private String todo;
    @Future
    private LocalDate dueDate;

    private boolean finished;

}
