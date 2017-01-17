package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

    @Value("${hello.greeting}")
    private String helloGreeting;

    public String getHelloGreeting() {

        return helloGreeting;
    }
}
