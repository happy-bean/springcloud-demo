package org.happybean.springcloud.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wgt
 * @date 2019-01-15
 * @description
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
