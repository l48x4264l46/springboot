package cn.liuxianglin.study.springboot.config.swagger;

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

/**
 * <p>
 * swagger配置
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/15 14:54
 * @since 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * <p>
     * swagger配置
     * </p>
     *
     * @return springfox.documentation.spring.web.plugins.Docket
     * @author LiuXiangLin
     * @date 2021/12/15 15:19
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                // 指定构建api文档的详细信息的方法：apiInfo()
                .apiInfo(apiInfo()).select()
                // 指定要生成api接口的包路径
                .apis(RequestHandlerSelectors.basePackage("cn.liuxianglin.study.springboot")).paths(PathSelectors.any())
                //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .build();
    }

    /**
     * <p>
     * api信息配置
     * </p>
     *
     * @return springfox.documentation.service.ApiInfo
     * @author LiuXiangLin
     * @date 2021/12/15 15:18
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 标题
                .title("springboot学习项目")
                // 接口描述
                .description("项目api")
                // 联系方式
                .contact(new Contact("liuxianglin", "liuxianglin.cn", ""))
                // 版本信息
                .version("1.0")
                // 构建
                .build();
    }
}
