package com.nilzxq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONTest{
	
	public static void main(String[] args) {
//		setFastJSON();
		setMapToJSON();
	}
	/**
	 * 通过传统方式自己拼接字符串JSON
	 *  
	 * 2016年11月28日
	 */
   public static void setJSON(){
	   String str="	{ \"errorCode\": \"0\",\"errorMsg\": \"调用接口成功\",\"data\": [{\"userName\": \"余胜军\",\"position\": \"蚂蚁课堂创始人\",\"webAddres\": \"www.itmayiedu.com\"   },  {  \"userName\": \"周安旭\",  \"position\": \"蚂蚁课堂合伙人\",   \"webAddres\": \"www.itmayiedu.com\"  }    ]}";
       System.out.println(str);
   }
   /**
    * 
    *  通过fastJSON封装JSON
    * 2016年11月29日
    */
   public static void setFastJSON(){
	   JSONObject root=new JSONObject();
	   root.put("errorCode",0);
	   root.put("errorMsg","调用接口成功");
	   JSONArray dateArray=new JSONArray();
	   JSONObject userYushangjun=new JSONObject();
	   userYushangjun.put("userName", "余胜军");
	   userYushangjun.put("position","蚂蚁课堂");
	   userYushangjun.put("webAddress","www.itmayiedu.com");
	   dateArray.add(userYushangjun);
	   root.put("date",dateArray);
	   System.out.println(root.toJSONString());
   }
   
   /**
    * 
    *  通过map转换成json
    * 2016年11月29日
    */
   public static void setMapToJSON(){
	   HashMap<String,Object> root = new HashMap<String,Object>();
	   root.put("errorCode",0);
	   root.put("errorMsg","调用接口成功");
	  List<Map<String,String>> dateArray = new ArrayList<Map<String,String>>();
	  Map<String,String> userYushangjun=new HashMap<String, String>();
	  userYushangjun.put("userName", "余胜军");
	   userYushangjun.put("position","蚂蚁课堂");
	   userYushangjun.put("webAddress","www.itmayiedu.com");
	   dateArray.add(userYushangjun);
	   Map<String,String> userYushangjun1=new HashMap<String, String>();
	   userYushangjun1.put("userName", "余胜军1");
	   userYushangjun1.put("position","蚂蚁课堂1");
	   userYushangjun1.put("webAddress","www.itmayiedu.com");
	   dateArray.add(userYushangjun1);
	   root.put("date",dateArray);
	   System.out.println(new JSONObject().toJSONString(root));
	  
   }
}
