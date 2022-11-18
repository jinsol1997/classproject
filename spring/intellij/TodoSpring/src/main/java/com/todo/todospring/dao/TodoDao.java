package com.todo.todospring.dao;

import com.todo.todospring.domain.TodoDTO;
import lombok.Cleanup;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class TodoDao {

    public ArrayList<TodoDTO> selectAll(Connection conn) throws SQLException {

        String sql = "Select * from todolist";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        ArrayList<TodoDTO> result = new ArrayList<>();

        while (rs.next()){
            result.add(new TodoDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
        }

        return result;
    }

    public int register(Connection conn, TodoDTO dto) throws SQLException {

        int result = 0;

        String sql = "insert into todolist (todo, dueDate, finished) values (?, ?, ?)";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, dto.getTodo());
        pstmt.setString(2, dto.getDueDate());
        pstmt.setBoolean(3, dto.isFinished());

        result = pstmt.executeUpdate();

        return result;
    }

    public int modify(Connection conn, TodoDTO dto) throws SQLException {

        int result = 0;
        String sql = "update todolist set todo=?, duedate=?, finished=? where todoindex=?";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getTodo());
        pstmt.setString(2, dto.getDueDate());
        pstmt.setBoolean(3, dto.isFinished());
        pstmt.setLong(4, dto.getIndex());

        result = pstmt.executeUpdate();
        return result;
    }

    public TodoDTO read(Connection conn, int todoIndex) throws SQLException{

        String sql = "select * from todolist where todoindex=?";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, todoIndex);

        @Cleanup ResultSet rs = pstmt.executeQuery();
        TodoDTO result = null;
        if(rs.next()){
            result = new TodoDTO(rs.getInt("todoIndex"), rs.getString("todo"), rs.getString("dueDate"), rs.getBoolean("finished"));
        }
        return result;
    }

    public int remove(Connection conn, int todoIndex) throws SQLException{

        String sql = "delete from todolist where todoindex = ?";

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, todoIndex);

        int result = pstmt.executeUpdate();

        return result;
    }
}
