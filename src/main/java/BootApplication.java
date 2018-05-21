import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: xuke
 * @Date: 2018/5/14 17:54
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages={"cn.lfungame"})
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
