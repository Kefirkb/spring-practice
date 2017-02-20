package com.kefirkb

class MessageProviderEmbeddedImpl implements MessageProvider {
    String message;

    public MessageProviderEmbeddedImpl() {
        message = "default"
    }

    public MessageProviderEmbeddedImpl(String message) {
        this.message = message
    }

    @Override
    String getMessage() {
        return message
    }
}

beans {
    message String, 'Hello world!'
    messageFromEmbedded String, 'Hello world from Embedded!'
    messageProvider(MessageProviderImpl, message:message)
    messageProviderEmbedded(MessageProviderEmbeddedImpl, message:messageFromEmbedded)
    messageRenderer(MessageRendererImpl, messageProvider:messageProvider)
    messageRendererFromEmbedded(MessageRendererImpl,messageProvider:messageProviderEmbedded)
}
