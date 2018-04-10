package pkgfinal;
public class date {
    private String date;
    private int day=0,mounth=0,year=0;
    
    public void date(String x){
        this.date=x;
    }
    public void calDay(){
        if(this.date.substring(0,2).equals("01"))        this.day=1;
        else if(this.date.substring(0,2).equals("02"))   this.day=2;
        else if(this.date.substring(0,2).equals("03"))   this.day=3;
        else if(this.date.substring(0,2).equals("04"))   this.day=4;
        else if(this.date.substring(0,2).equals("05"))   this.day=5;
        else if(this.date.substring(0,2).equals("06"))   this.day=6;
        else if(this.date.substring(0,2).equals("07"))   this.day=7;
        else if(this.date.substring(0,2).equals("08"))   this.day=8;
        else if(this.date.substring(0,2).equals("09"))   this.day=9;
        else if(this.date.substring(0,2).equals("10"))   this.day=10;
        else if(this.date.substring(0,2).equals("11"))   this.day=11;
        else if(this.date.substring(0,2).equals("12"))   this.day=12;
        else if(this.date.substring(0,2).equals("13"))   this.day=13;
        else if(this.date.substring(0,2).equals("14"))   this.day=14;
        else if(this.date.substring(0,2).equals("15"))   this.day=15;
        else if(this.date.substring(0,2).equals("16"))   this.day=16;
        else if(this.date.substring(0,2).equals("17"))   this.day=17;
        else if(this.date.substring(0,2).equals("18"))   this.day=18;
        else if(this.date.substring(0,2).equals("19"))   this.day=19;
        else if(this.date.substring(0,2).equals("20"))   this.day=20;
        else if(this.date.substring(0,2).equals("21"))   this.day=21;
        else if(this.date.substring(0,2).equals("22"))   this.day=22;
        else if(this.date.substring(0,2).equals("23"))   this.day=23;
        else if(this.date.substring(0,2).equals("24"))   this.day=24;
        else if(this.date.substring(0,2).equals("25"))   this.day=25;
        else if(this.date.substring(0,2).equals("26"))   this.day=26;
        else if(this.date.substring(0,2).equals("27"))   this.day=27;
        else if(this.date.substring(0,2).equals("28"))   this.day=28;
        else if(this.date.substring(0,2).equals("29"))   this.day=29;
        else if(this.date.substring(0,2).equals("30"))   this.day=30;
        else if(this.date.substring(0,2).equals("31"))   this.day=31;
        else{
            System.out.println("-------------- error --------------");
            flight a1=new flight();
            a1.ch();
        }
        if(this.day!=0) calMounth();
    }
    public void calMounth(){
        if(this.date.substring(3,5).equals("01"))        this.mounth=1;
        else if(this.date.substring(3,5).equals("02"))   this.mounth=2;
        else if(this.date.substring(3,5).equals("03"))   this.mounth=3;
        else if(this.date.substring(3,5).equals("04"))   this.mounth=4;
        else if(this.date.substring(3,5).equals("05"))   this.mounth=5;
        else if(this.date.substring(3,5).equals("06"))   this.mounth=6;
        else if(this.date.substring(3,5).equals("07"))   this.mounth=7;
        else if(this.date.substring(3,5).equals("08"))   this.mounth=8;
        else if(this.date.substring(3,5).equals("09"))   this.mounth=9;
        else if(this.date.substring(3,5).equals("10"))   this.mounth=10;
        else if(this.date.substring(3,5).equals("11"))   this.mounth=11;
        else if(this.date.substring(3,5).equals("12"))   this.mounth=12;
        else{
            System.out.println("-------------- error --------------");
            flight a1=new flight();
            a1.ch();
        }
        if(this.mounth!=0) calYear();
    }
    public void calYear(){
        if(this.date.substring(6).equals("2018"))        this.year=2018;
        else if(this.date.substring(6).equals("2019"))   this.year=2019;
        else if(this.date.substring(6).equals("2020"))   this.year=2020;
        else{
            System.out.println("-------------- error --------------");
            flight a1=new flight();
            a1.ch();
        }
    }
    public int getDay(){
    return day;
    }
    public int getMounth(){
    return mounth;
    }
    public int getYear(){
    return year;
    }
}
