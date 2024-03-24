package com.hpham.springmultimoduledemo;

import com.hpham.Logger;
import com.hpham.MyLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Logger logger = MyLoggerFactory.getLogger();

    @GetMapping("/test/error")
    public void logErrorEndpoint() {
        logger.error("Hitting error endpoint");
    }

    @GetMapping("/test/info")
    public void logInfoEndpoint() {
        logger.error("Hitting info endpoint");
    }

    @GetMapping("/test/debug")
    public void logDebugEndpoint() {
        logger.error("Hitting debug endpoint");
    }

    @GetMapping("/test/warn")
    public void logWarnEndpoint() {
        logger.error("Hitting warn endpoint");
    }
}
