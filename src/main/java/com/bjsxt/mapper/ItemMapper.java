package com.bjsxt.mapper;

import com.bjsxt.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {
    //查寻所有信息
    @Select("select * from item")
    List<Item> selectAll();

    /*//根据id删除信息
    int deleteById(Long id);

    //根据id查询信息
    Item selectById(Long id);

    //根据id修改信息
    int updateById(Item item);*/

}
