package book.bible3rd.ch10timeFormat.part2;

import java.util.*;
import java.text.*;

class DateFormatEx03 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        
        try {
            Date d = df.parse("2015³â 11¿ù 23ÀÏ");
            System.out.println(df2.format(d));
        } catch (Exception e) {
        }
    } // main
}