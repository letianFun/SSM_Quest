package com.qfedu.service;

import com.qfedu.domain.Quest;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/5 20:15
 */
public interface QuestService {
    boolean save(Quest quest);
    boolean delete(int id);
    List<Quest> queryAll();
}
