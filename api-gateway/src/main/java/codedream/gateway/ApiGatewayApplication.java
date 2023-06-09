package codedream.gateway;

import codedream.gateway.filter.AccessFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author alice
 * @time 2023-06-05 15:45
 **/
@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewayApplication.class).web(true).run(args);
    }

}
