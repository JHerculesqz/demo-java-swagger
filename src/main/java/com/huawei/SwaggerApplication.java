package com.huawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
public class SwaggerApplication {
	// #region main

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

	// #endregion

	// #region swagger

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_12).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.huawei")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Crystal REST API").description("Crystal REST API with Swagger")
				.termsOfServiceUrl("http://www.google.com").contact("Crystal").license("Apache License Version 2.0")
				.licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE").version("2.0")
				.build();
	}

	// #endregion
}
