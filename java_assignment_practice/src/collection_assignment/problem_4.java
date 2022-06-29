package collection_assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class problem_4 {

    public static void main(String args[]) throws ParseException  {
        String Date1="21-07-2000";
        String Date2="18-04-1998";
        Date x=new SimpleDateFormat("dd-mm-yyyy").parse(Date1);
        Date y=new SimpleDateFormat("dd-mm-yyyy").parse(Date2);

        LinkedList<Date> dateList = new LinkedList<Date>();

        
        dateList.add(x);
        dateList.add(y);
        int i=dateList.size()-1;
        while(i>=0){
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String strDate= formatter.format(dateList.get(i));
            System.out.print("Your date of Birth is "+strDate + " ");
            int year=1900+dateList.get(i).getYear();
            if(year%4==0)
            {
                System.out.println("it was a leap year");
            }
            else
            {
                System.out.println("It was not a leap year");
            }
            i--;
        }

    }

}