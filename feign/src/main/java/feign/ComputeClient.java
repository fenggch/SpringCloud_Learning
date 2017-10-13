/*
 * Copyright (c) 2017 by XuanBang Information Technology Co.Ltd.
 *           All rights reserved
 */

package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * class functional description
 *
 * @author Feng Guicheng
 * @version 1.0.0
 * @since 2017-10-12
 */
@FeignClient(value = "compute-service" ,fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
