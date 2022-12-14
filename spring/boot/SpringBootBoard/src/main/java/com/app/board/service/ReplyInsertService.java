package com.app.board.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.entity.Reply;
import com.app.board.mapper.ReplyMapper;
import com.app.board.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyInsertService {

    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private ReplyRepository replyRepository;

    public Reply insertReply(ReplyDTO replyDTO){

        Reply reply = replyDTO.toReplyEntity();
        return replyRepository.save(reply);
        // return replyMapper.insertReply(replyDTO);
    }

}
