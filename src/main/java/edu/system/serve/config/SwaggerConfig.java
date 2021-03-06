package edu.system.serve.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Swagger配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // 配置Swagger的Docket的Bean实例
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("学生接口")
                .select()
                // 要扫描的包
                .apis(RequestHandlerSelectors.basePackage("edu.system.serve.controller.student"))
                .build();
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("教师接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("edu.system.serve.controller.teacher"))
                .build();
    }

    @Bean
    public Docket docket3() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("管理员接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("edu.system.serve.controller.manager"))
                .build();
    }

    // 配置Swagger信息 apiInfo
    private ApiInfo apiInfo() {

        // 作者信息
        Contact contact = new Contact(
                "Alex Yu",
                "https://ymq19.cn/",
                "1976583473@qq.com"
        );

        return new ApiInfo(
                "简单教务管理系统接口",
                "......",
                "v2.0",
                "",
                contact,
                "",
                "",
                new ArrayList<>()
        );
    }
}
