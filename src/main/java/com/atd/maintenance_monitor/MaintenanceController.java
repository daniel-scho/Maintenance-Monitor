package com.atd.maintenance_monitor;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaintenanceController {

    Timestamp timestamp = new Timestamp();
    String ts = timestamp.getTimestamp();


    // http://localhost:8080/status/"xy"
    @GetMapping("/status/{message}")
    public String changeState(
            @PathVariable String message

    ) {

        if (message.equals("reset")) {
            return "green " + ts;
        } else {
            return "red " + ts;
        }

    }
    @GetMapping("/status")
    public String initialState() {
            return "green " + ts;
        }
}
