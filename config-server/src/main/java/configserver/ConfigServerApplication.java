/*
 * Copyright (c) 2017 by XuanBang Information Technology Co.Ltd.
 *           All rights reserved
 */

package configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2017-10-13
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }
}
