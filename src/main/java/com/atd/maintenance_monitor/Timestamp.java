package com.atd.maintenance_monitor;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timestamp {

    public String getTimestamp() {
        return String.format("last update: " + DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
    }
}
