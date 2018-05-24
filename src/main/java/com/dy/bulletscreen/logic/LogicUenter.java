package com.dy.bulletscreen.logic;

import java.util.HashMap;
import java.util.Map;

import com.sixseven.http.tool.HttpUtil;

/*
 * 加入房间
 * */
public class LogicUenter {
    public void getMessageLogic(Map<String, Object> msg) {
        String uri = "";
        
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("type", msg.get("type"));
        data.put("rid", msg.get("rid"));
        data.put("nn", msg.get("nn"));
        data.put("uid", msg.get("uid"));
        
        String result = HttpUtil.doPost(uri, data);
        System.out.println(result);
    }
}
