package org.academiadecodigo.ladybug.client.model.events;

public class FakeEventCreator {

    private Event avengersInfinityWarLX2203;
    private Event avengersInfinityWarPT2203;
    private Event avengersInfinityWarLX2303;
    private Event avengersInfinityWarPT2303;
    private Event tombRaiderLX2303;
    private Event tombRaiderPT2303;
    private Event tombRaiderLX2403;
    private Event tombRaiderPT2403;
    private Event benjaminClementineLX2903;
    private Event machineHeadPT3103;
    private Event pausLX1304;


    private String[] getAvengersSessions() {
        String[] avengersSessions = new String[3];
        avengersSessions[0] = "17h30";
        avengersSessions[1] = "19h00";
        avengersSessions[2] = "21h30";
        return avengersSessions;
    }

    private String[] getTombRaiderSessions() {
        String[] tombRaiderSessions = new String[3];
        tombRaiderSessions[0] = "18h00";
        tombRaiderSessions[1] = "19h30";
        tombRaiderSessions[2] = "22h00";
        return tombRaiderSessions;
    }


    public void createEvents() {

        // Avengers Infinity War LISBOA - 22.03
        avengersInfinityWarLX2203 = new Event(EventType.MOVIE, "Avengers: Infinity Wars", "The Avengers " +
                "and their allies must be willing to sacrifice all in an attempt to\ndefeat the powerful Thanos " +
                "before his blitz of devastation and ruin puts an end to the " +
                "universe.", Location.LISBOA, 22, 03, getAvengersSessions(), 15.30);
        System.out.println(avengersInfinityWarLX2203.toString());
        // Avengers Infinity War PORTO - 22.03
        avengersInfinityWarPT2203 = new Event(EventType.MOVIE, "Avengers: Infinity Wars", "The Avengers " +
                "and their allies must be willing to sacrifice all in an attempt to\ndefeat the powerful Thanos " +
                "before his blitz of devastation and ruin puts an end to the " +
                "universe.", Location.LISBOA, 22, 03, getAvengersSessions(), 15.30);
        System.out.println(avengersInfinityWarPT2203.toString());
        // Avengers Infinity War LISBOA - 23.03
        avengersInfinityWarLX2303 = new Event(EventType.MOVIE, "Avengers: Infinity Wars", "The Avengers " +
                "and their allies must be willing to sacrifice all in an attempt to\ndefeat the powerful Thanos " +
                "before his blitz of devastation and ruin puts an end to the " +
                "universe.", Location.LISBOA, 23, 03, getAvengersSessions(), 15.30);
        System.out.println(avengersInfinityWarLX2303.toString());
        // Avengers Infinity War PORTO - 23.03
        avengersInfinityWarPT2303 = new Event(EventType.MOVIE, "Avengers: Infinity Wars", "The Avengers " +
                "and their allies must be willing to sacrifice all in an attempt to\ndefeat the powerful Thanos " +
                "before his blitz of devastation and ruin puts an end to the " +
                "universe.", Location.LISBOA, 23, 03, getAvengersSessions(), 15.30);
        System.out.println(avengersInfinityWarPT2303.toString());

        // Tomb Raider LISBOA - 23.03
        tombRaiderLX2303 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.LISBOA, 23, 03, getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderLX2303.toString());
        // Tomb Raider PORTO - 23.03
        tombRaiderPT2303 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.PORTO, 23, 03, getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderPT2303.toString());
        // Tomb Raider LISBOA - 24.03
        tombRaiderLX2403 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.LISBOA, 24, 03, getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderLX2403.toString());
        // Tomb Raider PORTO - 24.03
        tombRaiderPT2403 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.PORTO, 24, 03, getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderPT2403.toString());
        // MUSIC //
        // Benjamin Clementine LISBOA 29.03
        benjaminClementineLX2903 = new Event(EventType.MUSIC, "Benjamin Clementine", "The 2015 Mercury " +
                "Prize winner returns to Portugal", Location.LISBOA, 29, 03, new String[]{"21h30"}, 30);
        System.out.println(benjaminClementineLX2903.toString());
        // Machine Head PORTO 31.03
        machineHeadPT3103 = new Event(EventType.MUSIC, "Machine Head", "Machine Head are back to Portugal for the presentation of the 'Catharsis' album.",
                Location.PORTO, 31, 03, new String[]{"21h00"}, 32);
        System.out.println(machineHeadPT3103.toString());
        // Paus LISBOA 13.04
        pausLX1304 = new Event(EventType.MUSIC, "Paus", "Paus presents 'Madeira', their newest album",
                Location.LISBOA, 13, 04, new String[]{"21h30"}, 15);
        System.out.println(pausLX1304.toString());

    }

    public Event getAvengersInfinityWarLX2303() {
        return avengersInfinityWarLX2303;
    }

    public Event getAvengersInfinityWarPT2303() {
        return avengersInfinityWarPT2303;
    }

    public Event getAvengersInfinityWarLX2203() {
        return avengersInfinityWarLX2203;
    }

    public Event getAvengersInfinityWarPT2203() {
        return avengersInfinityWarPT2203;
    }

    public static void main(String[] args) {

        FakeEventCreator fEC = new FakeEventCreator();

        fEC.createEvents();
    }
}