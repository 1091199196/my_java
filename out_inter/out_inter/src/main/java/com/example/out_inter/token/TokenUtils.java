package com.example.out_inter.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {

    //设置过期时间
    private static final long EXPIRE_DATE = 30 * 60 * 100000;
    //token
    private static final String TOKEN_SECRET = "";

    public static String getToken(String userName, String pwd) {
        String token = "";
        //过期时间
        Date date = new Date(System.currentTimeMillis() + EXPIRE_DATE);
        //秘钥以及加密算法
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        //设置头部信息
        Map<String, Object> header = new HashMap<>();
        header.put("type", "JWT");
        header.put("alg", "HS256");
        token = JWT.create()
                .withHeader(header)
                .withClaim("userName", userName)
                .withClaim("pwd", pwd).withExpiresAt(date)
                .sign(algorithm);


        return token;
    }

    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
