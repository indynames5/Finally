package pkgfinal;
import java.util.*;
public class flight extends data {
    
    static String sorce,dtn,date;
    flight(){
        System.out.println("\n=========== BOOK FLIGHT ===========");
    }

    flight(int x){
        this();
        int i =x;
    }

    public void ch(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Sorce           --->");
        sorce=sc.nextLine();
        System.out.print("Destination     --->");
        dtn=sc.nextLine();
        System.out.print("date            --->");
        date=sc.nextLine(); 
        getDate();
    }
    public void getDate() {
         date a = new date ();
         a.date(date);
         System.out.println(date);
         a.calDay();
         int day=a.getDay(); 
         int mounth=a.getMounth(); 
         int year=a.getYear();
         
         System.out.println(day+" "+mounth+" "+year+" .");
         
         
    }

    
}
