package com.kefirkb.annotated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Sergey on 19.02.2017.
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageRendererImpl implements MessageRenderer {

    @Autowired
    private List<MessageProvider> messageProviders;

    public void printMessage() {
        messageProviders
                .stream()
                .forEach(p-> System.out.println(p.getMessage()));

    }
}
