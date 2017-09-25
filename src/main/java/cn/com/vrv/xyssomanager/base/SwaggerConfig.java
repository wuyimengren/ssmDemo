package cn.com.vrv.xyssomanager.base;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select().apis(RequestHandlerSelectors.basePackage("cn.com.vrv.xyssomanager.web"))//controller路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf(){
        return new ApiInfoBuilder()
                .title("信源嗖搜后台管理系统接口文档")
                .termsOfServiceUrl("http://blog.csdn.net/u014231523网址链接")
                .description("springmvc swagger2")
                .contact(new Contact("diaoxingguo", "http://blog.csdn.net/u014231523", "diaoxingguo@163.com"))
                .build();

    }
}