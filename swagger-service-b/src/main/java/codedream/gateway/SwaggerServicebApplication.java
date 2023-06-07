package codedream.gateway;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author alice
 * @time 2023-06-05 15:45
 **/
@EnableDiscoveryClient
@EnableSwagger2Doc
@SpringBootApplication
public class SwaggerServicebApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerServicebApplication.class).web(true).run(args);
    }
}
