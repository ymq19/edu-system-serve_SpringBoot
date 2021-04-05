package edu.system.serve.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import edu.system.serve.pojo.student.User;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 下发token
 */
@Service
public class TokenService {

    public String getToken() {
        Date start = new Date();
        // 一分钟有效时间
        long validateTime = System.currentTimeMillis() + 2 * 60 * 60 * 1000;
        Date end = new Date(validateTime);

        return JWT.create().withIssuedAt(start)
                .withExpiresAt(end)
                .sign(Algorithm.HMAC256("ymq19"));
    }
}
