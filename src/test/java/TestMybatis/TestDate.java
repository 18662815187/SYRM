package TestMybatis;

import com.lwyykj.common.FormatDate;

public class TestDate {
	
	public static void main(String[] args) {
		String t = "2017-11-13";
		String style = "yy-MM-dd";
		int formatDate = FormatDate.formatDate(t,style);
		System.out.println(formatDate);
	}
}
