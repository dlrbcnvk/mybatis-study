package com.sgcho.mybatisstudy.fruit.repository;

import com.sgcho.mybatisstudy.fruit.entity.Fruit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FruitMapper {
    Fruit selectById(String no);
}
