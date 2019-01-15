package org.happybean.springcloud.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wgt
 * @date 2019-01-15
 * @description
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EURKA-SERVICE/test?name="+name,String.class);
    }


}
