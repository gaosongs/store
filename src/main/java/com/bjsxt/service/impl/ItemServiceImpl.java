package com.bjsxt.service.impl;

import com.bjsxt.mapper.ItemMapper;
import com.bjsxt.pojo.Item;
import com.bjsxt.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
//    @Autowired
//    private OrderMapper orderMapper;


    @Override
    public List<Item> selectAll() {
        return itemMapper.selectAll();
    }

    /*@Override
    public int deleteById(Long id) {
        return itemMapper.deleteById(id);
    }


    @Override
    // 没有他，能事务回滚吗？
    @Transactional
    public int buy(Long id) {
        Item item = itemMapper.selectById(id);
        Order order = new Order();
        order.setPrice(item.getPrice());
        int index = orderService.insertOrder(order);
        if (index == 1) {
            Item itemUpdate = new Item();
            itemUpdate.setId(id);
            itemUpdate.setNum(item.getNum() - 1);
            index = itemMapper.updateById(itemUpdate);
            if (index == 1) {
                return 1;
            }
        }
        return 0;
    }*/
}
