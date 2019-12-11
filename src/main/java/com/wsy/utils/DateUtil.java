package com.wsy.utils;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * 方法1：根据传入的日期获取年龄
	 * @param src
	 * @return
	 */
	
	public static int getAge (Date src) {
		Calendar calendar = Calendar.getInstance();
		long time = src.getTime();
		int age = src.getYear();
		int age2 = src.getDate();
		return age - age2;
	}
	
	/**
	 * 方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	 * @param src
	 * @return
	 */
	
	public static Date getDateByMonthInit (Date src) {
		Calendar calendar = Calendar.getInstance();
		
		return src;
	}
	
	/**
	 * 方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	 * @param src
	 * @return
	 */
	
	public static Date getDateByMonthLast(Date src) {
		
		
		
		return src;
	}
	
	
	/**
	 * 方法4：求未来日期离今天还剩的天数
	 * @param future
	 * @return
	 */
	
	public static int getDaysByFuture (String future) {
		SimpleDateFormat sdf = new SimpleDateFormat(future);
		
		return 0;
	}
	

	/**
	 * 方法5：求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 */
	
	public static int getDaysByDeparted (Date departed) {
		
		
		return 0;
	}
}
