package guru.springframework.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/24/17.
 */
@Component
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
