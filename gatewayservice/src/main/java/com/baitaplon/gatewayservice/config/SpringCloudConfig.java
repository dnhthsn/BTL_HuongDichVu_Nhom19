package com.baitaplon.gatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/bacsi/**")
                        .uri("http://localhost:8081/")
                        )
                .route(r -> r.path("/benhnhan/**")
                        .uri("http://localhost:8082/")
                        )
                .route(r -> r.path("/notification/**")
                        .uri("http://localhost:8084/")
                        )
                .route(r -> r.path("/lichkham/**")
                        .uri("http://localhost:8083/")
                        )
                .route(r -> r.path("/dangkykhamlai/**")
                        .uri("http://localhost:8085/")
                        )

                .build();
    }
    
}
