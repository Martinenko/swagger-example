package com.swagger.boundary;

import javax.ejb.Stateless;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.MINUTES;

@Stateless
public class CellularEventsResourceDelegate {

    boolean isCurrentlyConnected(LocalDateTime lastActivity) {
        boolean connected = false;

        if (lastActivity != null) {
            long minutes = MINUTES.between(lastActivity, LocalDateTime.now());
            connected = minutes < 2;
        }

        return connected;
    }

}
