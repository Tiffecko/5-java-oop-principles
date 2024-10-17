package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("test");

        logger1.info("test.inf");
        logger1.error("test.err");
        logger1.debug("test.deb");
        logger1.warning("test.war");

    }
}
