package com.example.android.todolist.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mitya on 12/10/2016.
 */

public class DateUtils {
    private static DateFormat dateFormat =
            new SimpleDateFormat("yyyy MM dd HH:mm", Locale.getDefault());

    // "Wed, 09 30, 2016"
    private static DateFormat dateFormatDate =
            new SimpleDateFormat("EEE, MMM dd, yyyy", Locale.getDefault());

    // 12:59
    private static DateFormat dateFormatTime =
            new SimpleDateFormat("HH:mm", Locale.getDefault());

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

    public static String dateToStringDate(Date date) {
        return dateFormatDate.format(date);
    }

    public static String dateToStringTime(Date date) {
        return dateFormatTime.format(date);
    }
}
