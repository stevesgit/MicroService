package cn.steve.eurekaconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/config")
@RefreshScope
@RestController
public class EurekaConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientApplication.class, args);
    }

    @Value("${form}")
    private String form;

    @Autowired
    private Environment environment;

    @GetMapping("/get_name")
    public String name() {
        return "form:" + form;
    }

    @GetMapping("/get_name_env")
    public String name_env() {
        return environment.getProperty("form", "undefine");
    }

}
