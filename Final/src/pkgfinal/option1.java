package pkgfinal;
import java.util.*;   
abstract public  class option1 {
    static  String bsorce[][]=new String[999][999];
    static  String bdtn[][]=new String[999][999];
    static  String tgo[][]=new String[999][999];
    static  String tcer[][]=new String[999][999];
    static  String tback[][]=new String[999][999];
    static  String tosorce[][]=new String[999][999];
    public static int price[][] = new int [999][999];
    static  String cls[][]=new String[999][999];
    static  String sAir[][]=new String[999][999];
    static  String dAir[][]=new String[999][999];
    static int hr [][] = new int [999][999];
    static int a[] = new int [999];
    public String airline[]={
            "Qatar Airways",	                                                                  
            "Singapore Airlines",	
            "ANA All Nippon Airways",	
            "Emirates",	
            "Cathay Pacific",	
            "EVA Air",	
            "Lufthansa",	
            "Etihad Airways",
            "Hainan Airlines",	
            "Garuda Indonesia",	
            "Thai Airways",	
            "Turkish Airlines",	
            "Virgin Australia",	
            "Swiss Int'l Air Lines",	
            "Qantas Airways",	
            "Japan Airlines",	
            "Austrian",	
            "Air France",	
            "Air New Zealand",	
            "Asiana Airlines", 	
            "Bangkok Airways"};
    static  int type;
    
    static int j;
    GregorianCalendar time = new GregorianCalendar();
    public int cyr=time.get(Calendar.YEAR),cmt=time.get(Calendar.MONTH),cdy=time.get(Calendar.DATE),
               chr=time.get(Calendar.HOUR),cmn=time.get(Calendar.MINUTE),csc=time.get(Calendar.SECOND);
    abstract public void print();
}
