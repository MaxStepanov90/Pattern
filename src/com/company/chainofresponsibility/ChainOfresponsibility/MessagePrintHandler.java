package com.company.chainofresponsibility.ChainOfresponsibility;

class MessagePrintHandler extends MessageHandler {
    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
    }
}
