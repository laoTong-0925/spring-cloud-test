package com.mengxuegu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: t_t
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer_5001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }

}
