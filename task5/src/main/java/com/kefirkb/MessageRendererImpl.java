package com.kefirkb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Sergey on 19.02.2017.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageRendererImpl implements MessageRenderer {


    private MessageProvider messageProvider;

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    public void printMessage() {

        System.out.println(messageProvider.getMessage());
    }
}
