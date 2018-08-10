package com.romantic.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ------------------------------------
 * Create with IntelliJ IDEA
 * Author:zhouyichen
 * Date:2018/8/9
 * Time:21:42
 * To change this template use File | Settings | File Templates.
 */
public class CreateCalendar {
    public static Calendar createOrderTime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        Date date=new Date ();
        System.out.println ("现在时间："+simpleDateFormat.format (date));

        Calendar calendar = Calendar.getInstance ();
        calendar.setTime (date);
        String year=String.valueOf(calendar.get(Calendar.YEAR));
        String month=String.valueOf(calendar.get(Calendar.MONTH));
        String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)+2);
        String hour=String.valueOf (calendar.get(Calendar.HOUR_OF_DAY));

        return calendar;

    }

    public static void main(String[] args) {
        Calendar a=createOrderTime ();
        System.out.println (a);
    }
}
