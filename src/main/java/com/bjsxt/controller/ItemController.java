package com.bjsxt.controller;

import com.bjsxt.pojo.Item;
import com.bjsxt.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String showIndex() {
        // 基本上主页面都叫做index页面，更有人连登录都叫做index
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Item> showList() {
        return itemService.selectAll();
    }


    @RequestMapping("/delete")
    @ResponseBody
    public int deleteById(Long id) {
        return itemService.deleteById(id);
    }
/*
    @RequestMapping("/buy")
    @ResponseBody
    public int buy(Long id) {
        return itemService.buy(id);
    }*/
}
