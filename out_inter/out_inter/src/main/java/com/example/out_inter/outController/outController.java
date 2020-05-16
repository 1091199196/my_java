package com.example.out_inter.outController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.out_inter.common.AccessRequired;
import com.example.out_inter.pojo.User;
import com.example.out_inter.util.CommonRestUtil;
import com.example.out_inter.util.HttpUtil;
import com.example.out_inter.util.HttpUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@Api(value = "outController", tags = "对外接口模块")
public class outController {


    @RequestMapping(value = "/getToken", method = {})
    @ResponseBody
    @ApiOperation(value = "获取token")
    public HashMap<String,Object>  getToken(User user){
         Object object = new Object();
        Map<String, Object> map = new HashMap<>();
        map.put("userName","admin");
        map.put("password","zfsoft");
        HashMap<String,Object> outMap = new HashMap<>();
        try {
            String post = HttpUtil.post("http://10.101.85.120:8083/ai/authRestService/getAuthToken", "application/json", JSON.toJSONString(map), "UTF-8");
            outMap = JSON.parseObject(post, HashMap.class);
            // object  = CommonRestUtil.sendPostJsonStr("http://10.101.85.120:8083/ai/authRestService/getAuthToken", map.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outMap;
    }

    @RequestMapping("/sendMessage")
    @ResponseBody
    @ApiOperation(value = "推送用户message" )
    public HashMap<String,Object>  getAA(User user){
        Object object = new Object();
        HashMap<String,Object> outMap = new HashMap<>();
        try {
           // String post = HttpUtil.post("http://10.101.85.120:8083/ai/authRestService/getAuthToken", "application/json", JSON.toJSONString(outMap), "UTF-8");
            //outMap = JSON.parseObject(post, HashMap.class);
            // object  = CommonRestUtil.sendPostJsonStr("http://10.101.85.120:8083/ai/authRestService/getAuthToken", map.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        outMap.put("code","200");
        outMap.put("message","推送用户信息成功");
        return outMap;
    }

    @AccessRequired
    @RequestMapping("/testBb")
    public void  testBb(){
        System.out.println("aaaaaaaaaaaaaaa");

    }

}
