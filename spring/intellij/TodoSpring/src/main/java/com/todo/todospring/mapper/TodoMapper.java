package com.todo.todospring.mapper;

import com.todo.todospring.domain.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TodoMapper {

    ArrayList<TodoDTO> selectAll();

    int register(TodoDTO todoDTO);

    int modify(TodoDTO todoDTO);

    TodoDTO read(int todoindex);

    int remove(int todoindex);

}
