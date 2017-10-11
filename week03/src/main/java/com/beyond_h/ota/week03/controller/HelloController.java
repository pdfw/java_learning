package com.beyond_h.ota.week03.controller;

import com.beyond_h.ota.week03.Models.ResultModel;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/num")
    @ResponseBody
    public  ResultModel HelloWorld(){
        return GetRandomNum();
    }
    public ResultModel GetRandomNum()
    {

        Date now=new Date();
        ResultModel rtn = new ResultModel();
//        rtn.setStartTime(now);
//
//
//        int[] values=new int[1000];
//        Random random=new Random();
//        for(int i=0;i<1000;i++)
//        {
//            values[i]=i*10+random.nextInt(9);
//        }
//        Date end=new Date();
//        rtn.setEndTime(end);
//        rtn.setNumbers(values);
//        return  rtn;

        long startTime = System.currentTimeMillis();   //获取开始时间
        rtn.setStartTime(startTime);
        long[] randoms = new long[1000];
        int count = 0;
        for(int i = 0; i < 1000;i++) {
            randoms[i] = Math.round(Math.random()*10+count); //获取特定间隔内的随机数
            count += 10; //将间隔向前移动10
        }

        long endTime = System.currentTimeMillis(); //获取结束时间
        rtn.setEndTime(endTime);
        rtn.setNumbers(randoms);
        return  rtn;
    }
}
