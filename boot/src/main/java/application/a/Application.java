/*
 * Copyright (c) 2017 by XuanBang Information Technology Co.Ltd.
 *           All rights reserved
 */

package application.a;import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2017-10-11
 */
@Controller
@SpringBootApplication
public class Application {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }


}
