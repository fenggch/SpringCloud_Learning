/*
 * Copyright (c) 2017 by XuanBang Information Technology Co.Ltd.
 *           All rights reserved
 */

package com.didispace.web;import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2017-10-10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void  main(String[]  args){
        new SpringApplicationBuilder(ClientApplication.class).web(true).run(args);
    }
}
