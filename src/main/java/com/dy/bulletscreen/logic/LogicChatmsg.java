package com.dy.bulletscreen.logic;

import java.util.HashMap;
import java.util.Map;

import com.sixseven.http.tool.HttpUtil;

/*
 * 弹幕消息
 * */
public class LogicChatmsg {
    public void getMessageLogic(Map<String, Object> msg) {
        String uri = "http://zyxapi.applinzi.com/index.php?s=/home/LivingBulletscreen/chatmsg/";
        
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("type", msg.get("type"));
        data.put("rid", msg.get("rid"));
        data.put("nn", msg.get("nn"));
        data.put("uid", msg.get("uid"));
        data.put("bnn", msg.get("bnn"));
        data.put("txt", msg.get("txt"));
        data.put("cst", msg.get("cst"));
        data.put("ifs", msg.get("ifs"));
        
        String result = HttpUtil.doPost(uri, data);
        System.out.println(result);
    }
}
