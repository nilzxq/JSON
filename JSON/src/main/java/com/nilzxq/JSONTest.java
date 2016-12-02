package com.nilzxq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONTest{
	
	public static void main(String[] args) {
//    	setFastJSON();
//		setMapToJSON();
		//setBeanToJSON();
		//analysisJSON();
		jsonToBean();
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
   
   /**
    * 
    *  通过实体类转换JSON
    * 2016年11月29日
    */
   public static void setBeanToJSON(){
	   RootEntity rootEntity=new RootEntity();
	   rootEntity.setErrorCode("0");
	   rootEntity.setErrorMsg("调用接口成功");
	  ArrayList<UserEntity> date = new ArrayList<UserEntity>();
	  UserEntity userEntity=new UserEntity();
	  userEntity.setPosition("蚂蚁课堂");
	  userEntity.setUserName("余胜军");
	  userEntity.setWebAddress("www.itmayiedu.com");
	  date.add(userEntity);
	  rootEntity.setDate(date);
	  System.out.println(new JSONObject().toJSONString(rootEntity));
   }
   /**
    *  解析JSON
    *  
    * 2016年11月29日
    */
   public static void analysisJSON(){
	   String jsonstr="	{ \"errorCode\": \"0\",\"errorMsg\": \"调用接口成功\",\"data\": [{\"userName\": \"余胜军\",\"position\": \"蚂蚁课堂创始人\",\"webAddres\": \"www.itmayiedu.com\"   },  {  \"userName\": \"周安旭\",  \"position\": \"蚂蚁课堂合伙人\",   \"webAddres\": \"www.itmayiedu.com\"  }    ]}";
	// 将json字符串转换成json
	   JSONObject root = new JSONObject().parseObject(jsonstr);
	   String errorCode = root.getString("errorCode");
	   String errorMsg = root.getString("errorMsg");
	   System.out.println("errorCode:"+errorCode+",errorMsg:"+errorMsg);
	   JSONArray dataArr = root.getJSONArray("data");
	   for(int i=0;i<dataArr.size();i++){
		   JSONObject dataBean=(JSONObject)dataArr.get(i);
		   String position=dataBean.getString("position");
		   String userName=dataBean.getString("userName");
		   String webAddress=dataBean.getString("webAddress");
		   System.out.println("position:"+position+",userName:"+userName+",webAddress"+webAddress);
	   }
   } 
   /**
    * 通过JSON转实体类
    *  
    * 2016年12月2日
    */
   public static void jsonToBean(){
	   String jsonstr="	{ \"errorCode\": \"0\",\"errorMsg\": \"调用接口成功\",\"date\": [{\"userName\": \"余胜军\",\"position\": \"蚂蚁课堂创始人\",\"webAddres\": \"www.itmayiedu.com\"   },  {  \"userName\": \"周安旭\",  \"position\": \"蚂蚁课堂合伙人\",   \"webAddres\": \"www.itmayiedu.com\"  }    ]}";
	// 将json字符串转换成json
	   RootEntity rootEntity = new JSONObject().parseObject(jsonstr, RootEntity.class);
      System.out.println(rootEntity.toString());
   }
}
