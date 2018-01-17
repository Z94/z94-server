
package com.z94.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置类
 *
 * @author Z94
 * @since jdk1.7
 * @version 2018年1月17日 Z94
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    
    /** title */
    @Value("${swagger2.title}")
    private String title;
    
    /** description */
    @Value("${swagger2.description}")
    private String description;
    
    /** version */
    @Value("${swagger2.version}")
    private String version;
    
    /** basePackage */
    @Value("${swagger2.basePackage}")
    private String basePackage;
    
    /**
     * 创建Docket的Bean
     *
     * @return Docket
     */
    @Bean
    public Docket cerateRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
            .apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build();
    }
    
    /**
     * 创建该Api的基本信息
     *
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        
        return new ApiInfoBuilder().title(title).description(description).version(version).build();
    }
}
