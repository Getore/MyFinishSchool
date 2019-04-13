package com.bootdo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.bootdo.*.dao")
@SpringBootApplication
@EnableCaching
public class BootdoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootdoApplication.class, args);
        System.out.println("  _____ _                  _      _            _______ _____ __  __        _ _       _           _ \n" +
                " / ____| |                | |    (_)          |__   __/ ____|  \\/  |      | (_)     (_)         | |\n" +
                "| (___ | |__   ___ _ __   | |     _   ______     | | | |    | \\  / |   ___| |_ _ __  _  ___ __ _| |\n" +
                " \\___ \\| '_ \\ / _ \\ '_ \\  | |    | | |______|    | | | |    | |\\/| |  / __| | | '_ \\| |/ __/ _` | |\n" +
                " ____) | | | |  __/ | | | | |____| |             | | | |____| |  | | | (__| | | | | | | (_| (_| | |\n" +
                "|_____/|_| |_|\\___|_| |_| |______|_|             |_|  \\_____|_|  |_|  \\___|_|_|_| |_|_|\\___\\__,_|_|\n" +
                "                                                                                                   \n" +
                "                                                                                                   \n" +
                " _                  _                        _     _                      _             _                   \n" +
                "| |                | |                      | |   | |                    (_)           | |                  \n" +
                "| |_ _ __ ___  __ _| |_ _ __ ___   ___ _ __ | |_  | |_ ___ _ __ _ __ ___  _ _ __   ___ | | ___   __ _ _   _ \n" +
                "| __| '__/ _ \\/ _` | __| '_ ` _ \\ / _ \\ '_ \\| __| | __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _ \\| |/ _ \\ / _` | | | |\n" +
                "| |_| | |  __/ (_| | |_| | | | | |  __/ | | | |_  | ||  __/ |  | | | | | | | | | | (_) | | (_) | (_| | |_| |\n" +
                " \\__|_|  \\___|\\__,_|\\__|_| |_| |_|\\___|_| |_|\\__|  \\__\\___|_|  |_| |_| |_|_|_| |_|\\___/|_|\\___/ \\__, |\\__, |\n" +
                "                                                                                                 __/ | __/ |\n" +
                "                                                                                                |___/ |___/ \n" +
                " _                  _                        _                      _   \n" +
                "| |                | |                      | |                    | |  \n" +
                "| |_ _ __ ___  __ _| |_ _ __ ___   ___ _ __ | |_   _ __   __ _ _ __| |_ \n" +
                "| __| '__/ _ \\/ _` | __| '_ ` _ \\ / _ \\ '_ \\| __| | '_ \\ / _` | '__| __|\n" +
                "| |_| | |  __/ (_| | |_| | | | | |  __/ | | | |_  | |_) | (_| | |  | |_ \n" +
                " \\__|_|  \\___|\\__,_|\\__|_| |_| |_|\\___|_| |_|\\__| | .__/ \\__,_|_|   \\__|\n" +
                "                                                  | |                   \n" +
                "                                                  |_|                   ");
    }
}
