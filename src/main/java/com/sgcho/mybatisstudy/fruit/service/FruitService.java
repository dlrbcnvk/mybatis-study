package com.sgcho.mybatisstudy.fruit.service;

import com.sgcho.mybatisstudy.fruit.entity.Fruit;
import com.sgcho.mybatisstudy.fruit.repository.FruitMapper;
import org.springframework.stereotype.Service;

@Service
public class FruitService {
    private final FruitMapper fruitMapper;

    public FruitService(FruitMapper fruitMapper) {
        this.fruitMapper = fruitMapper;
    }

    public Fruit getFruit(String no) {
        return fruitMapper.selectById(no);
    }
}
