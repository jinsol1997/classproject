package com.todo.todospring.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderCommand {

    private List<OrderItem> orderItems;
    private Address address;

}
