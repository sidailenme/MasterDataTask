package com.yalta.controllers;

import com.yalta.service.interfaces.NumberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class MainController {

    private final NumberService numberService;

    @PostMapping("/")
    public ResponseEntity<Integer> takeList(@RequestBody List<Integer> numbers) {
        ResponseEntity<Map<Integer,Integer>> response = new ResponseEntity<>(numberService.test(numbers), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Map<Integer, Integer>> takeList() {
        List<Integer> numbers = new Random().ints(0, 100).limit(100).boxed().collect(Collectors.toList());
        ResponseEntity<Map<Integer,Integer>> response = new ResponseEntity<>(numberService.test(numbers), HttpStatus.OK);
        return response;
    }
}
