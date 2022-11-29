package com.app.dept.domain;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DeptDTO {

    @Min(value = 1)
    @Max(value = 99)
    @Positive
    private int deptno;

    @NotEmpty   // 문자열은 비어있지 않은 상태, List -> 요소의 개수가 비어있는지
    private String dname;

    @NotEmpty
    private String loc;

}

// @Future : 현재 시간보다 미래이어야 함
// @Email : 이메일 체크
// @NotBlank : 공백문자열 & NULL 체크
// @NotNull : Null 체크
