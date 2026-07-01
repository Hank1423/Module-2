package com.dictionary.controller;

@FunctionalInterface
public interface CommandHandler {
    void execute(Request request);
}
