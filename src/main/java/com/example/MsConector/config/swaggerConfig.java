package com.example.MsConector.config;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

public class swaggerConfig {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
        .title("proyecto de conexion")
        .version("1.0")
        .description("este es el microservicio de conexion entre usuarios y materias")
        );
    }    
    
}
