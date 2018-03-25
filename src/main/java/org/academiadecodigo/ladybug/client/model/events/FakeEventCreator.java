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
    private Event theSwanLakeLX2503;
    private Event theSwanLakePT2903;
    private Event arcticMonkeysLX2703;
    private Event arcticMonkeysPT2803;
    private Event theStrokesLX2903;


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

    private String[] getTheSwanLakeSessions(){
        String[] theSwanLakeSessions = new String[1];
        theSwanLakeSessions[0] = "21h30";
        return theSwanLakeSessions;
    }

    private String[] getArcticMonkeysPTSessions(){
        String[] arcticMonkeysPTSessions = new String[1];
        arcticMonkeysPTSessions[0] = "19h00";
        return arcticMonkeysPTSessions;
    }

    private String[] getArcticMonkeysLXSessions(){
        String[] arcticMonkeysLXSessions = new String[1];
        arcticMonkeysLXSessions[0] = "21h00";
        return arcticMonkeysLXSessions;
    }

    private String[] getTheStrokesSessions(){
        String[] theStrokesSessions = new String[1];
        theStrokesSessions[0] = "17h30";
        return theStrokesSessions;
    }




    public void createEvents() {

        theSwanLakeLX2503 = new Event(EventType.THEATRE, "The Swan Lake", "The best ballet thing in the world", Location.LISBOA, 25, 03, getTheSwanLakeSessions(), 33.89);
        theSwanLakePT2903 = new Event(EventType.THEATRE, "The Swan Lake", "The best ballet thing in the world", Location.PORTO, 29, 03, getTheSwanLakeSessions(), 33.89);

        arcticMonkeysLX2703 = new Event(EventType.MUSIC, "Arctic Monkeys", "No description could ever mdo them justice!", Location.LISBOA, 27, 03, getArcticMonkeysLXSessions(), 62.29);
        arcticMonkeysPT2803 = new Event(EventType.MUSIC, "Arctic Monkeys", "No description could ever mdo them justice!", Location.PORTO, 28, 03, getArcticMonkeysPTSessions(), 62.29);

        theStrokesLX2903 = new Event(EventType.MUSIC, "The Strokes", "Another fucking description", Location.LISBOA, 29, 03, getTheStrokesSessions(), 48.54);


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
                "herself on the island where her father disappeared.", Location.LISBOA, 23, 03,getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderLX2303.toString());
        // Tomb Raider PORTO - 23.03
        tombRaiderPT2303 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.PORTO, 23, 03,getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderPT2303.toString());
        // Tomb Raider LISBOA - 24.03
        tombRaiderLX2403 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.LISBOA, 24, 03,getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderLX2403.toString());
        // Tomb Raider PORTO - 24.03
        tombRaiderPT2403 = new Event(EventType.MOVIE, "Tomb Raider", "Lara Croft, the fiercely " +
                "independent daughter of a missing adventurer, must push herself \nbeyond her limits when she finds " +
                "herself on the island where her father disappeared.", Location.PORTO, 24, 03,getTombRaiderSessions(), 12.45);
        System.out.println(tombRaiderPT2403.toString());

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
