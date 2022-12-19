package com.app.board.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_reply")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Reply {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rno;

    @Column
    private int bno;

    @Column
    private String reply;

//    @Column
//    private String replyer;

    @ManyToOne
    @JoinColumn(name = "replyer")
    private BoardMember replyer;

    @Column(insertable = false)
    private LocalDate replydate;

    @Column(insertable = false)
    private LocalDate updatedate;

}
