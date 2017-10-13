/*
 * Copyright (c) 2017 by XuanBang Information Technology Co.Ltd.
 *           All rights reserved
 */

package feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2017-10-12
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
