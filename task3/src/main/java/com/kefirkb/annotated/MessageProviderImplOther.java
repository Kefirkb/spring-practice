package com.kefirkb.annotated;

import org.springframework.stereotype.Component;

/**
 * Created by Sergey on 19.02.2017.
 */
@Component
public class MessageProviderImplOther implements MessageProvider {
    public String getMessage() {
        return "Hello world Two!";
    }
}
