package com.company.chainofresponsibility.ChainApp;

abstract class Logger {
    int proirity;
    public Logger(int priority) {
        this.proirity = priority;
    }
    Logger next;
    public void setNext(Logger next) {
        this.next = next;
    }
    public void writeMessage(String message, int level) {
        if (level <= proirity) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }
    abstract void write(String message);
}