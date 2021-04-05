package edu.system.serve.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import edu.system.serve.utils.StatusCode;
import io.swagger.models.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 拦截器：获取token并验证token
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 从http请求中取出token
        String token = request.getHeader("Authorization");

        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("ymq19")).build();

        try {
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            // token过期
            String tokenExpire = "{status:" +  StatusCode.TOKEN_EXPIRE_CODE + "}";
            JSONObject jsonObject = JSONObject.parseObject(tokenExpire);

            response.getWriter().println(jsonObject);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
