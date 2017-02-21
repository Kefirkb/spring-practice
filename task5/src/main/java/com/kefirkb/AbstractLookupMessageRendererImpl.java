package com.kefirkb;

/**
 * Created by Sergey on 21.02.2017.
 */
public abstract class AbstractLookupMessageRendererImpl implements MessageRenderer {
    public abstract MessageProvider getMessageProvider();

    @Override
    public void printMessage() {
        System.out.println(getMessageProvider().getMessage());
    }
}
