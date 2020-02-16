package com.company.chainofresponsibility.ChainOfresponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageAddExclamationMarkHandler(
                new MessageVerifyHandler(
                        new MessagePrintHandler(null)));
        messageHandler.handle("hello world");
    }
}





