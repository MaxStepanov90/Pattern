package com.company.chainofresponsibility.ChainOfresponsibility;

class MessageVerifyHandler extends MessageHandler {
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        if (!message.matches(".*\\d.*")) {
            messageHandler.handle(message);
        }
    }
}