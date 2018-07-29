package com.qfedu.dao;

import com.qfedu.domain.Quest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import javax.management.Query;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/5 20:00
 */
public interface QuestDao {
    @Insert("insert into t_quest(title,detail,createtime) values(#{title},#{detail},now())")
    int insert(Quest quest);
    @Select("select * from t_quest")
    @ResultType(Quest.class)
    List<Quest> queryAll();
    @Delete("delete from t_quest where id=#{id}")
    int delete(int id);
}
