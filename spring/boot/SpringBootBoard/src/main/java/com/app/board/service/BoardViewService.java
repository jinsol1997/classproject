package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.entity.Board;
import com.app.board.mapper.BoardMapper;
import com.app.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardViewService {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private BoardMapper boardMapper;

    public Board selectBoardDTO(int bno){
        return boardRepository.findById(bno).get();
    }

}
