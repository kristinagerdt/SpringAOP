package org.example.springdemo.aspect.around;

import org.example.springdemo.config.SpringConfig;
import org.example.springdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TrafficFortuneService trafficFortuneService = context.getBean(TrafficFortuneService.class);

        logger.info("-----------> Main App");
        String fortune = trafficFortuneService.getFortune(true);
        logger.info(fortune);

        context.close();
    }
}