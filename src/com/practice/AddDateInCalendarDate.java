package com.practice;

import java.util.Calendar;
import java.util.Date;

public class AddDateInCalendarDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
        
        
        // =========
        int days = 10;
        Calendar cal2 = Calendar.getInstance();
        Date date = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, days);
	}

}
