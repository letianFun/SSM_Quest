package com.qfedu.web.controller;

import com.qfedu.domain.Quest;
import com.qfedu.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/5 20:18
 */
@Controller//创建对象
public class QuestController {
    @Autowired
    private QuestService service;

    //新增
    @RequestMapping("/questsave.do")
    public String save(Quest quest){
        if(service.save(quest)){
            //刷新页面
            System.out.println("新增成功");
        }
        return "quest.html";
    }
    //查询
    @ResponseBody
    @RequestMapping("/questall.do")
    public List<Quest> queryAll(){
        return service.queryAll();
    }
    //删除
    @RequestMapping("/questdel.do")
    public void questdel(int id, HttpServletResponse response) throws IOException {
        if(service.delete(id)){//成功1
            response.getWriter().print(1);
        }else{//失败2
            response.getWriter().print(2);
        }
    }

}
