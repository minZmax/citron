package citron;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // Swagger 2를 사용하겠다고 선언
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2) // Swagger 2 문서 타입 설정
                .select()
                .apis(RequestHandlerSelectors.any()) // 모든 API를 선택
                .paths(PathSelectors.any()) // 모든 경로를 선택
                .build();
    }
}