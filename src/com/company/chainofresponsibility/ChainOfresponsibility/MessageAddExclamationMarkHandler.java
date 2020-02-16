package com.company.chainofresponsibility.ChainOfresponsibility;

class MessageAddExclamationMarkHandler extends MessageHandler {
    public MessageAddExclamationMarkHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        messageHandler.handle(message + "!");
    }
}