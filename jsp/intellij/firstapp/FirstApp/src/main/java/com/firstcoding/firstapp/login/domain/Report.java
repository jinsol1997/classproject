package com.firstcoding.firstapp.login.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Report {

    private String snum;
    private String sname;
    private MultipartFile report;

}
