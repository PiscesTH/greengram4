package com.green.greengram4.common;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Greengram Ver.4",
                description = "인스타그램 클론 코딩 v4",
                version = "4.0.0"),
        security = @SecurityRequirement(name = "authorization")
)
@SecurityScheme(
        type = SecuritySchemeType.HTTP,
        name = "authorization",     //키값
        in = SecuritySchemeIn.HEADER,   //헤더에
        bearerFormat = "JWT",   //생략해도 문제는 없음
        scheme = "Bearer"   //Bearer dgasdf~ 형식으로
)
public class SwaggerConfiguration {
    
}
