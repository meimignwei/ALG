package com.mmw.jianzhiofffer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    private static List<Integer> getMonthBetween(Integer minDate, Integer maxDate) throws ParseException {
        ArrayList<Integer> result = new ArrayList<Integer>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");//格式化为年月

        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();

        min.setTime(sdf.parse(String.valueOf(minDate)));
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

        max.setTime(sdf.parse(String.valueOf(maxDate)));
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

        Calendar curr = min;
        while (curr.before(max)) {
            result.add(Integer.parseInt(sdf.format(curr.getTime())));
            curr.add(Calendar.MONTH, 1);
        }
        return result;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(Arrays.toString(getMonthBetween(202101, 202212).toArray()));
    }

}
