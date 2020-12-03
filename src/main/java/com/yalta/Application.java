package com.yalta;

import com.yalta.service.impl.NumberServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
//
//        NumberServiceImpl numberService = new NumberServiceImpl();
//        List<Integer> collect = new Random().ints(0, 100).limit(100).boxed().collect(Collectors.toList());
//        System.out.println(numberService.test(collect));

    }
}
