package com.example.android.listviewtorecycleview.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mitya on 12/23/2016.
 */

public class DateUtils {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd HH:mm", Locale.getDefault());

    public static Date stringToDate(String string) {
        try {
            return dateFormat.parse(string);
        } catch (ParseException e) {
            return Calendar.getInstance().getTime();
        }
    }

    public static String dateToString(Date date) {
        return dateFormat.format(date);
    }
}
