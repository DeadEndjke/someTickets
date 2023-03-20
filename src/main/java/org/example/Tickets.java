package org.example;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Tickets {
    private Ticket[] tickets;

    public static class Ticket{
        private String origin;
        private String origin_name;
        private String destination;
        private String destination_name;
        private String departure_date;
        private LocalTime departure_time;
        private String arrival_date;
        private LocalTime arrival_time;
        private String carrier;
        private int stops;
        private long price;

        public Ticket(String origin, String origin_name, String destination, String destination_name, String departure_date, String departure_time, String arrival_date, String arrival_time, String carrier, int stops, long price) {
            this.origin = origin;
            this.origin_name = origin_name;
            this.destination = destination;
            this.destination_name = destination_name;
            this.departure_date = departure_date;
            this.departure_time = LocalTime.parse(departure_time, DateTimeFormatter.ofPattern("H:mm"));
            this.arrival_date = arrival_date;
            this.arrival_time = LocalTime.parse(arrival_time, DateTimeFormatter.ofPattern("H:mm"));
            this.carrier = carrier;
            this.stops = stops;
            this.price = price;
        }

        public long getFlightTimeInSeconds(){
            long zone;
            long estimatedTime = this.departure_time.until(this.arrival_time, SECONDS.toChronoUnit());
            LocalTime diff = LocalTime.parse("8:00", DateTimeFormatter.ofPattern("H:mm"));
            long diffInSec = diff.toSecondOfDay();

            return estimatedTime + diffInSec;
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "origin='" + origin + '\'' +
                    ", origin_name='" + origin_name + '\'' +
                    ", destination='" + destination + '\'' +
                    ", destination_name='" + destination_name + '\'' +
                    ", departure_date='" + departure_date + '\'' +
                    ", departure_time='" + departure_time + '\'' +
                    ", arrival_date='" + arrival_date + '\'' +
                    ", arrival_time='" + arrival_time + '\'' +
                    ", carrier='" + carrier + '\'' +
                    ", stops=" + stops +
                    ", price=" + price +
                    '}';
        }

        public Ticket() {
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin_name() {
            return origin_name;
        }

        public void setOrigin_name(String origin_name) {
            this.origin_name = origin_name;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDestination_name() {
            return destination_name;
        }

        public void setDestination_name(String destination_name) {
            this.destination_name = destination_name;
        }

        public String getDeparture_date() {
            return departure_date;
        }

        public void setDeparture_date(String departure_date) {
            this.departure_date = departure_date;
        }

        public LocalTime getDeparture_time() {
            return departure_time;
        }

        public void setDeparture_time(String departure_time) {
            this.departure_time = LocalTime.parse(departure_time, DateTimeFormatter.ofPattern("H:mm"));
        }

        public String getArrival_date() {
            return arrival_date;
        }

        public void setArrival_date(String arrival_date) {
            this.arrival_date = arrival_date;
        }

        public LocalTime getArrival_time() {
            return arrival_time;
        }

        public void setArrival_time(String arrival_time) {
            this.arrival_time = LocalTime.parse(arrival_time, DateTimeFormatter.ofPattern("H:mm"));
        }

        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public int getStops() {
            return stops;
        }

        public void setStops(int stops) {
            this.stops = stops;
        }

        public long getPrice() {
            return price;
        }

        public void setPrice(long price) {
            this.price = price;
        }
    }

    public Tickets() {
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "tickets=" + Arrays.toString(tickets) +
                '}';
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Tickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
}
