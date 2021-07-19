package same;

import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class DateAssign1 {
	  
      public static void main(String[] args) {
    	  
    	  String dt= "May 1,2016";          
    	  DateTimeFormatter f=DateTimeFormatter.ofPattern("MMMM d,yyyy",Locale.ENGLISH);
    	  LocalDate newDate= LocalDate.parse(dt,f);
    	  System.out.println(newDate);
    	  
      }
      
}