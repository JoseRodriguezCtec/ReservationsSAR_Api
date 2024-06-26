package com.SAR.ReservationsSAR.shared.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI apiDoc() {
        return new OpenAPI()
                .info(new Info()
                        .title("Reservation SAR - API")
                        .description("Sauce Alto Resort. The REST API of Reservation SAR application")
                        .version("1.0.0"));
    }
}
