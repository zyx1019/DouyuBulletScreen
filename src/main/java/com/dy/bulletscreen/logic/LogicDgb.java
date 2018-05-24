package com.dy.bulletscreen.logic;

import java.util.HashMap;
import java.util.Map;

import com.sixseven.http.tool.HttpUtil;


/*
 * 礼物
 * */
public class LogicDgb {
    
    public void getMessageLogic(Map<String, Object> msg) {
        String uri = "http://zyxapi.applinzi.com/index.php?s=/home/LivingBulletscreen/dgb/";
        
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("type", msg.get("type"));
        data.put("rid", msg.get("rid"));
        data.put("nn", msg.get("nn"));
        data.put("uid", msg.get("uid"));
        data.put("bnn", msg.get("bnn"));
        data.put("gfid", msg.get("gfid"));
        
        String result = HttpUtil.doPost(uri, data);
        System.out.println(result);
    }
}
