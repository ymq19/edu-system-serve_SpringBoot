package edu.system.serve.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Druid配置
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return new DruidDataSource();
    }

    // 后台监控
    @Bean
    public ServletRegistrationBean registrationBean() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        HashMap<String, String> init = new HashMap<>();

        init.put("loginUsername", "ymq19");
        init.put("loginPassword", "YMQ19991105");

        // 允许本机可以访问
        init.put("allow", "localhost");

        bean.setInitParameters(init);
        return bean;
    }

    // 过滤器
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();

        bean.setFilter(new WebStatFilter());

        Map<String, String> init = new HashMap<>();

        // 不进行统计
        init.put("exclusions", "*.js, *.css, /druid/*");

        bean.setInitParameters(init);

        return bean;
    }
}
