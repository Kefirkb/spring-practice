package com.kefirkb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Sergey on 19.02.2017.
 */

@AllArgsConstructor
@Data
public class MessageProviderImpl implements MessageProvider {

    private String message;

    public MessageProviderImpl() {
        System.out.println("Create new Bean MessageProvider!");
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
