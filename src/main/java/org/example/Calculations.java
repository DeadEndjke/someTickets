package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculations {
    public static LocalTime getAverageFlightTimeInSeconds(Tickets tickets){
        long totalSeconds = 0;
        for(int i = 0; i < tickets.getTickets().length; ++i){
            totalSeconds += tickets.getTickets()[i].getFlightTimeInSeconds();
        }
        long average = totalSeconds / tickets.getTickets().length;
        return LocalTime.ofSecondOfDay(average);
    }

    public static LocalTime getPercentile90(Tickets tickets){
        List<Long> seconds = new ArrayList<>();
        for(int i = 0; i < tickets.getTickets().length; ++i){
            seconds.add(tickets.getTickets()[i].getFlightTimeInSeconds());
        }
        Collections.sort(seconds);

        int proc = (int)Math.ceil(0.9 + seconds.size()-1);

        return LocalTime.ofSecondOfDay(seconds.get(proc-1));

    }
}
