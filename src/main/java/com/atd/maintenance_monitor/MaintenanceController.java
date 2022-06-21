package com.atd.maintenance_monitor;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaintenanceController {

    // http://localhost:8080/sub/5/4
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

    /*  Example Code:
    // http://localhost:8080/sub?a=5&b=4
    @GetMapping("/sub")
    public int sub(
            @RequestParam int a, @RequestParam int b
    ) {
        return a - b;
    }
    @GetMapping("/mal")
    public int mal(
            @RequestParam int a, @RequestParam int b
    ) {
        return a * b;
    }
    */

}
