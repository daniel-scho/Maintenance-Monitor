package com.atd.maintenance_monitor;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TimestampTest {
    Timestamp timestamp = new Timestamp();

    @Test
    void getTime() {
        assertEquals(String.format("last update: " +
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now())),
                timestamp.getTimestamp());
    }
}