package com.todo.todospring.domain;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginRequest {

    @NotEmpty
    private String uid;

    @NotEmpty
    private String pw;
}
