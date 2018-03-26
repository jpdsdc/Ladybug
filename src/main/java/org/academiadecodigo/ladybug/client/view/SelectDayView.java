package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.ladybug.utils.Messages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectDayView extends AbstractView{

    private String[] options;
    private Date today = new Date();
    private Date tomorrow;
    private Date twoDaysFromToday;
    private Date threeDaysFromToday;
    private Date fourDaysFromToday;
    private Date fiveDaysFromToday;
    private Date sixDaysFromToday;


    private final int msPerDay = 86400000;

    int selected;

    public SelectDayView(Prompt prompt) {
        super(prompt);
        SimpleDateFormat sDF = new SimpleDateFormat("EEEE");
        options = new String[]{sDF.format(today), sDF.format(today), sDF.format(today), sDF.format(today), sDF.format(today), sDF.format(today), sDF.format(today)};
    }

    @Override
    public void show() {
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage(Messages.SELECTDAY + "");

        selected = prompt.getUserInput(menuInputScanner);
    }

    public String getSelected(){
        return options[selected - 1];
    }

    public void setTomorrow(Date tomorrow) {
        this.tomorrow = tomorrow;
    }

    public void setTwoDaysFromToday(Date twoDaysFromToday) {
        this.twoDaysFromToday = twoDaysFromToday;
    }

    public void setThreeDaysFromToday(Date threeDaysFromToday) {
        this.threeDaysFromToday = threeDaysFromToday;
    }

    public void setFourDaysFromToday(Date fourDaysFromToday) {
        this.fourDaysFromToday = fourDaysFromToday;
    }

    public void setFiveDaysFromToday(Date fiveDaysFromToday) {
        this.fiveDaysFromToday = fiveDaysFromToday;
    }

    public void setSixDaysFromToday(Date sixDaysFromToday) {
        this.sixDaysFromToday = sixDaysFromToday;
    }
}
