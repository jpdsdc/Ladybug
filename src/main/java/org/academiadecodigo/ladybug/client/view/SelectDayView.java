package org.academiadecodigo.ladybug.client.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

public class SelectDayView extends AbstractView{
    private Date today = new Date();
    private Calendar calendar = Calendar.getInstance();
    private String weekday1;
    private String weekday2;
    private String weekday3;
    private String weekday4;
    private String weekday5;
    private String weekday6;
    private String weekday7;



    private String[] options;

    int selected;

    public SelectDayView(Prompt prompt) {
        super(prompt);
        setWeekdays();
        options = new String[]{weekday1, weekday2, weekday3, weekday4, weekday5, weekday6, weekday7};
    }

    @Override
    public void show() {
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("Select a day: ");

        selected = prompt.getUserInput(menuInputScanner);
    }

    public String getSelected(){
        return options[selected - 1];
    }

    public void setWeekdays(){
        calendar.setTime(today);
        // set first day of current week
        int weekdayOrdinal1 = calendar.get(Calendar.DAY_OF_WEEK);
        weekday1 = setWeekdays(weekdayOrdinal1);

        // set second day of current week
        int weekdayOrdinal2 = calendar.get(Calendar.DAY_OF_WEEK) + 1;
        weekday2 = setWeekdays(weekdayOrdinal2);

        // set third day of current week
        int weekdayOrdinal3 = calendar.get(Calendar.DAY_OF_WEEK) + 2;
        weekday3 = setWeekdays(weekdayOrdinal3);

        // set fourth day of current week
        int weekdayOrdinal4 = calendar.get(Calendar.DAY_OF_WEEK) + 3;
        weekday4 = setWeekdays(weekdayOrdinal4);

        // set first day of current week
        int weekdayOrdinal5 = calendar.get(Calendar.DAY_OF_WEEK) + 4;
        weekday5 = setWeekdays(weekdayOrdinal5);

        // set sixth day of current week
        int weekdayOrdinal6 = calendar.get(Calendar.DAY_OF_WEEK) + 5;
        weekday6 = setWeekdays(weekdayOrdinal6);

        // set seventh day of current week
        int weekdayOrdinal7 = calendar.get(Calendar.DAY_OF_WEEK) + 6;
        weekday7 = setWeekdays(weekdayOrdinal7);

    }

    public String setWeekdays(int ordinal){
        int newOrdinal = 0;
        if (ordinal > 7){
            newOrdinal = ordinal - 7;
        } else {
            newOrdinal = ordinal;
        }
        DateFormatSymbols dfs = new DateFormatSymbols();
        return dfs.getWeekdays()[newOrdinal];
    }
}
