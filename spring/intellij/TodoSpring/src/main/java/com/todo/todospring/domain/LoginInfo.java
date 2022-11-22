package com.todo.todospring.domain;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo {

    private String uid;
    private String uname;
    private String uphoto;

}
