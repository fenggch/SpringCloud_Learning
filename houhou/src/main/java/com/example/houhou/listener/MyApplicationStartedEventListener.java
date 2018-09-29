package com.example.houhou.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2018-06-25
 */

public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SpringApplication app = event.getSpringApplication();
     //   app.setBanner(false);// 不显示banner信息
        logger.info("==MyApplicationStartedEventListener==");
    }
}
