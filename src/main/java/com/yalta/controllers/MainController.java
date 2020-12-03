package com.yalta.controllers;

import com.yalta.service.interfaces.NumberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class MainController {

    private final NumberService numberService;

    @PostMapping("/")
    public ResponseEntity<Map<Integer, Integer>> takeList(@RequestBody List<Integer> numbers) {
        return new ResponseEntity<>(numberService.test(numbers), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Map<Integer, Integer>> takeList() {
        List<Integer> numbers = new Random().ints(0, 500).limit(200).boxed().collect(Collectors.toList());
        return new ResponseEntity<>(numberService.test(numbers), HttpStatus.OK);
    }
}
