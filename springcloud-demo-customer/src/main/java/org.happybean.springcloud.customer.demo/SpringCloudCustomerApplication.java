package org.happybean.springcloud.customer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wgt
 * @date 2019-01-15
 * @description
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringCloudCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCustomerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
