package com.atd.maintenance_monitor;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaintenanceController {
    Timestamp timestamp = new Timestamp();

    // http://localhost:8080/change/"xy"
    @GetMapping("/change/{message}")
    public String changeState(
            @PathVariable String message

    ) {

        String ts = timestamp.getTimestamp();
        if (message.equals("reset")) {
            return "green\n" + ts;
        } else {
            return "red\n" + ts;
        }

    }
}
