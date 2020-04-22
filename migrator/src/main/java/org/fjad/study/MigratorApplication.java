package org.fjad.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.core.env.Environment;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@SpringBootApplication
public class MigratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MigratorApplication.class);

    }
}
