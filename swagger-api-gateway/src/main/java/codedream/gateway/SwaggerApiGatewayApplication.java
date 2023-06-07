package codedream.gateway;

import codedream.gateway.filter.AccessFilter;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author alice
 * @time 2023-06-05 15:45
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2Doc
public class SwaggerApiGatewayApplication {
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerApiGatewayApplication.class).web(true).run(args);
    }

}
