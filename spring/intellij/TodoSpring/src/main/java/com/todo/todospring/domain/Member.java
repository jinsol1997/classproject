package com.todo.todospring.domain;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Member {

    @Positive
    private int idx;
    @NotEmpty
    private String uid;
    @NotEmpty
    private String pw;

    private String uuid;
    private String uname;
    private String uphoto;

    public LoginInfo toLoginInfo(){
        return LoginInfo.builder().uid(this.uid).uname(this.uname).uphoto(this.uphoto).build();
    }

}
