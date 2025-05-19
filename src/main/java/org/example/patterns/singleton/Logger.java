package org.example.patterns.singleton;

import java.util.logging.*;

public class Logger {
    private static Logger instance;
    private java.util.logging.Logger logger;

    private Logger() {
        logger = java.util.logging.Logger.getLogger("MyAppLogger");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        logger.info(msg);
    }
}
