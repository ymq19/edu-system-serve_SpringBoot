package edu.system.serve.config;

import edu.system.serve.interceptor.AuthenticationInterceptor;
import edu.system.serve.interceptor.CorsInterceptor;
import edu.system.serve.utils.ExcludePatterns;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域设置和token验证
 */
@Configuration
public class WebMvcConfig {

    @Bean
    public WebMvcConfigurer corsConfig() {
        return new WebMvcConfigurer() {
            /**
             * 拦截器
             * @param registry
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new CorsInterceptor()).addPathPatterns("/**");
                registry.addInterceptor(new AuthenticationInterceptor()).addPathPatterns("/**").excludePathPatterns(ExcludePatterns.EXCLUDE_PATTERNS);
            }

            /**
             * 配置虚拟路径
             * @param registry
             */
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/api/v1/avatar/images/*")
                        .addResourceLocations("file:D:\\壁纸\\");
            }
        };
    }
}
