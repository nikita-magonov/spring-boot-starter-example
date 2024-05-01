package org.example.spring.boot.starter.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AutoConfiguration {

    @Bean
    fun logAspect() = LogAspect()
}
