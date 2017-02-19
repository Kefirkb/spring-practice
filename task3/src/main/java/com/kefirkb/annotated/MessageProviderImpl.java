package com.kefirkb.annotated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Sergey on 19.02.2017.
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageProviderImpl implements MessageProvider {

    @Autowired
    private String message;

    public String getMessage() {
        return message;
    }
}
