package com.atd.maintenance_monitor;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaintenanceController {

    // http://localhost:8080/change/"xy"
    @GetMapping("/change/{message}")
    public String changeState(
            @PathVariable String message

    ) {

        if (message.equals("reset")) {
            return "green\n";
        } else {
            return "red\n";
        }
    }
    @GetMapping("/change")
    public String initialState() {
            return "green\n";
        }
}
