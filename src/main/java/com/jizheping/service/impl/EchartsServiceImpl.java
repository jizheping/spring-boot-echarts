package com.jizheping.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jizheping.mapper.EchartsMapper;
import com.jizheping.service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EchartsServiceImpl implements EchartsService {
    @Autowired
    private EchartsMapper echartsMapper;

    @Override
    public String getMessageToShow() {
        List<Map> userList = echartsMapper.getUserList();

        List<Map> accountList = echartsMapper.getAccountList();

        for(Map user : userList){
            for(Map account : accountList){
                if(user.get("id").equals(account.get("id"))){
                    user.put("createTime",account.get("createTime"));
                    user.put("usableAmount",account.get("usableAmount"));
                    user.put("freezeAmount",account.get("freezeAmount"));
                }
            }
        }

        String json = JSONArray.toJSONString(userList);

        return json;
    }
}
