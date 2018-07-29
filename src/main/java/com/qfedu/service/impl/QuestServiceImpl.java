package com.qfedu.service.impl;

import com.qfedu.dao.QuestDao;
import com.qfedu.domain.Quest;
import com.qfedu.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/5 20:16
 */
@Service//创建对象
public class QuestServiceImpl implements QuestService {
    @Autowired//注入 赋值
    private QuestDao dao;

    public boolean save(Quest quest) {
        return dao.insert(quest)>0;
    }

    public boolean delete(int id) {
        return dao.delete(id)>0;
    }

    public List<Quest> queryAll() {
        return dao.queryAll();
    }
}
