package com.kefirkb;

import lombok.*;

/**
 * Created by Sergey on 19.02.2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageProviderImpl implements MessageProvider {

    private String message;

    public String getMessage() {
        return message;
    }
}
