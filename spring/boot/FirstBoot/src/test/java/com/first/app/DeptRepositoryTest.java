package com.first.app;

import com.first.app.entity.Dept;
import com.first.app.entity.DeptRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Log4j2
@SpringBootTest
public class DeptRepositoryTest {

    @Autowired
    private DeptRepository deptRepository;

    @Test
    public void JpaMethodTest() {

        List<Dept> list1 = deptRepository.findAll();
        for (Dept dept : list1) {
            log.info(dept);
        }

        log.info(":::::::::::::::::::::");

        // 정렬 기준 설정
        Sort sort = Sort.by(Sort.Direction.DESC, "dname");

        List<Dept> list2 = deptRepository.findAll(sort);

        for (Dept dept : list2) {
            log.info(dept);
        }

        log.info(":::::::::::::::::::::");

        // 검색
        Optional<Dept> dept1 = deptRepository.findById(10);
        Dept deptData = dept1.orElse(null);

        log.info(" Dept >>>>>> " + deptData);

        log.info(":::::::::::::::::::::");

        List<Integer> nos = Arrays.asList(10, 20, 30, 40);
        List<Dept> list3 = deptRepository.findAllById(nos);

        for (Dept dept : list3) {
            log.info(dept);
        }

        log.info(":::::::::::::::::::::");

        // insert
        Dept insertData = Dept.builder().dname("기획팀").loc("서울").build();

        log.info("insert 전 데이터 >>>>> " + insertData);

        Dept resultData = deptRepository.save(insertData);

        log.info("insert 후 데이터 >>>>> " + resultData);

        log.info(":::::::::::::::::::::");

        // update -> save() 이용
        Dept editData = Dept.builder().deptno(201).dname("QA").loc("분당").build();
        Dept editResult = deptRepository.save(editData);

        log.info("수정 처리 후 데이터 >>>>> " + editResult);

        log.info(":::::::::::::::::::::");

        // delete
        // deptRepository.deleteById(201);

        // 개수
        long cnt = deptRepository.count();
        log.info("전체 부서의 수 >>>> " + cnt);


    }

    @Test
    public void JpqlMethodTest() {
        Dept dept1 = deptRepository.findByDeptno(30);
        log.info(">>>>> " + dept1);

        log.info("####################");

        List<Dept> list1 = deptRepository.findByDnameLikeOrderByLocAsc("%A%");

        for(Dept dept : list1){
            log.info(dept);
        }

        log.info("####################");

        List<Dept> list2 = deptRepository.findByLocLike("%A%");

        for(Dept dept : list2){
            log.info(dept);
        }

        log.info("####################");

        List<Dept> list3 = deptRepository.findByDeptnoBetween(100, 300);

        for(Dept dept : list3){
            log.info(dept);
        }
    }
}
