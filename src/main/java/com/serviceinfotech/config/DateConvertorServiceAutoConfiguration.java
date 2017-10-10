package com.serviceinfotech.config;

import com.serviceinfotech.utils.DateConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateConvertorServiceAutoConfiguration {

    @Bean
    public DateConvertor dateConvertor() {
        return new DateConvertor();

    }
}
