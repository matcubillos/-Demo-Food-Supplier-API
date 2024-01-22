package com.fsba.foodsupplierbackendapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Matias",
                        email = "matcubillosn@gmail.com"
                ),
                description = "Documentation for [Demo] Food Supplier API",
                version = "1.0"
        ),
        servers = {
                @Server(
                        description = "DEV URL",
                        url = "http://localhost:8080"
                )
        }
)
public class OApiConfig {
}
