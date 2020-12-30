package com.bjsxt.service;

import com.bjsxt.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> selectAll();

   int deleteById(Long id);
/*
    int buy(Long id);*/
}
