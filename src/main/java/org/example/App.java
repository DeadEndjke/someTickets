package org.example;

public class App
{
    public static void main(String[] args) {
        final String json = "src/main/resources/tickets.json";
        Tickets tickets = Parser.getTicketsFromJson(json);

        System.out.println("среднее время полета между городами Владивосток и Тель-Авив: " + Calculations.getAverageFlightTimeInSeconds(tickets));

        System.out.println("90-й процентиль времени полета между городами Владивосток и Тель-Авив: " + Calculations.getPercentile90(tickets));


    }
}
