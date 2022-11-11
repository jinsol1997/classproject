package com.example.todolist.service;

import com.example.todolist.domain.TodoDTO;

import java.util.ArrayList;

public class TodoService {


    public ArrayList<TodoDTO> getTodoList(){

        ArrayList<TodoDTO> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add(new TodoDTO(i+1, "todo "+i, "2022-11-11", false));
        }

        return list;
    }

}
