package com.jsz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.jsz.dao","com.jsz.service"})
@Import({JDBCConfig.class,MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
