package com.company.chainofresponsibility.ChainOfresponsibility;

abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String message);
}