package edu.system.serve.utils;

import java.util.Arrays;
import java.util.List;

/**
 * 拦截器过滤路径
 */
public class ExcludePatterns {
    public final static List<String> EXCLUDE_PATTERNS = Arrays.asList(
            "/swagger-ui.html/**",
            "/swagger-resources",
            "/*/swagger/*",
            "/*/api-docs/*",
            "/*/configuration/*",
            "/webjars/**",
            "/",

            "/api/v1/login",
            "/api/v1/teacher/login",
            "/api/v1/super-user/login",
            "/api/v1/reset/*",
            // 图片路径
            "/api/v1/avatar/images/*"
    );
}
