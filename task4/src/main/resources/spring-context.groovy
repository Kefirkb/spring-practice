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
    messageProvider(MessageProviderImpl, message:message)
    messageRenderer(MessageRendererImpl, messageProvider:messageProvider)

    messageFromEmbedded String, 'Hello world from Embedded!'

    messageProviderEmbedded(MessageProviderEmbeddedImpl) {
        message = messageFromEmbedded
    }

    messageRendererFromEmbedded(MessageRendererImpl) {
        messageProvider = ref('messageProviderEmbedded')
    }
}
