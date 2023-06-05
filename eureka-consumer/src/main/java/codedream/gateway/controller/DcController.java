package codedream.gateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author alice
 * @time 2023-05-17 15:08
 **/
@RestController
public class DcController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DcController.class);

    @GetMapping("/consume")
    public String consumer() {
        LOGGER.info("consume");
        return "success";
    }

}
