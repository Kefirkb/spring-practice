import com.kefirkb.AbstractLookupMessageRendererImpl
import com.kefirkb.MessageProviderImpl
import com.kefirkb.PrintMessageReplacer

beans {

    message String,"Hello World!"
    provider(MessageProviderImpl) {
        message=ref(message)
    }

    lookupMessageRenderer(AbstractLookupMessageRendererImpl) {
        'xsd:lookup-method'(['xsd:name':'getMessageProvider','xsd:bean':'provider'])
    }
/*
    methodReplacer PrintMessageReplacer

    messageRendererWithReplacedMethod(MessageRendererImpl) {
        'replaced-method'('name':'printMessage','replacer':'methodReplacer')
    }*/


}
