package com.yalta.service.impl;

import com.yalta.service.interfaces.NumberService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NumberServiceImpl implements NumberService {

    @Override
    public Map<Integer, Integer> test(List<Integer> numbers) {
        Map<Integer, Integer> duplicate = new HashMap<>();
        numbers.stream().filter(this::isSimple).forEach(x -> duplicate.merge(x, 1, Integer::sum));
        return duplicate;
    }

    public boolean isSimple(int num) {
        boolean isSimple = true;
        int temp = 0;
        for (int i = 2; i < num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
}
