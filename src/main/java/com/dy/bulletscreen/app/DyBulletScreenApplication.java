package com.dy.bulletscreen.app;

import com.dy.bulletscreen.client.DyBulletScreenClient;
import com.dy.bulletscreen.utils.KeepAlive;
import com.dy.bulletscreen.utils.KeepGetMsg;

/**
 * @summary: 弹幕Demo程序启动类 
 * @author: FerroD     
 * @date:   2016-3-12   
 * @version V1.0
 */
public class DyBulletScreenApplication
{
	//设置需要访问的房间ID信息
	//private static final int roomId = 229346;
	private static final int roomId = 622779;
	
	//弹幕池分组号，海量模式使用-9999
	private static final int groupId = -9999;
	private static boolean isRun = true;
	
	public static void main(String[] args) {
	    
	    int errorCount = 0;
	    
	    while(isRun) {
	        //初始化弹幕Client
	        DyBulletScreenClient danmuClient = DyBulletScreenClient.getInstance();
	        
	        if (!danmuClient.getReadyFlag()) {
	            //设置需要连接和访问的房间ID，以及弹幕池分组号
	            danmuClient.init(roomId, groupId);

	            //保持弹幕服务器心跳
	            KeepAlive keepAlive = new KeepAlive();
	            keepAlive.start();
	            
	            //获取弹幕服务器发送的所有信息
	            KeepGetMsg keepGetMsg = new KeepGetMsg();
	            keepGetMsg.start();
	            
	            errorCount++;
	        }
	        
	        if (10 < errorCount) {
	            isRun = false;
	        }
	        
	        try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
}