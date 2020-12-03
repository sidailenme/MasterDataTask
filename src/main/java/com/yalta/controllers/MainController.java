package com.yalta.controllers;

import com.yalta.service.interfaces.NumberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class MainController {

    private final NumberService numberService;

    @PostMapping("/")
    public ResponseEntity<Map<Integer, Integer>> takeList(@RequestBody List<Integer> numbers) {
        return new ResponseEntity<>(numberService.test(numbers), HttpStatus.OK);
    }
}
