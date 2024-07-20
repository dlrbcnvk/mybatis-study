package com.sgcho.mybatisstudy.fruit.controller;

import com.sgcho.mybatisstudy.fruit.entity.Fruit;
import com.sgcho.mybatisstudy.fruit.service.FruitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/fruit/{no}")
    public Fruit getFruit(@PathVariable String no) {
        return fruitService.getFruit(no);
    }
}
