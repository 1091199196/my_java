package com.example.out_inter.util;

import cn.hutool.core.lang.UUID;

import java.util.Random;

public class RandomUtil {


    public static String getUuid(){
        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }

    public static String getRandomNumber(int len){
            Random r = new Random();
              StringBuilder rs = new StringBuilder();
              for (int i = 0; i < len; i++) {
                rs.append(r.nextInt(10));
                   }
           return rs.toString();
    }

    public static void main(String[] args) {
        String randomNumber = getRandomNumber(5);
        System.out.println(getUuid().replace("-","")+randomNumber+"zfsoft");
    }



}
