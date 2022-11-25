package com.todo.todospring.domain;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo {

    @NotEmpty
    private String uid;

    private String uname;
    private String uphoto;

}
