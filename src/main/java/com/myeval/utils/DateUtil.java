package com.myeval.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil  {

    public static String formateDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        return format.format(date);
    }
    public static String formateDate1(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        return format.format(date);
    }
}
