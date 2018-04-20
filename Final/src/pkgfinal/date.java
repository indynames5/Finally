package pkgfinal;
public class date {
    private String date;
    private int day=0,mounth=0,year=0,i;
    
    public void date(String x,int l){
        this.date=x;
        this.i=l;
    }
    public void calDay(){
        
        if(this.date.substring(0,2).equals("01")){        this.day=1;  calMounth(); }
        else if(this.date.substring(0,2).equals("02")){   this.day=2;  calMounth(); } 
        else if(this.date.substring(0,2).equals("03")){   this.day=3;  calMounth(); }
        else if(this.date.substring(0,2).equals("04")){   this.day=4;  calMounth(); }
        else if(this.date.substring(0,2).equals("05")){   this.day=5;  calMounth(); }
        else if(this.date.substring(0,2).equals("06")){   this.day=6;  calMounth(); }
        else if(this.date.substring(0,2).equals("07")){   this.day=7;  calMounth(); }
        else if(this.date.substring(0,2).equals("08")){   this.day=8;  calMounth(); }
        else if(this.date.substring(0,2).equals("09")){   this.day=9;  calMounth(); } 
        else if(this.date.substring(0,2).equals("10")){   this.day=10; calMounth();  }
        else if(this.date.substring(0,2).equals("11")){   this.day=11;  calMounth(); }
        else if(this.date.substring(0,2).equals("12")){   this.day=12;  calMounth(); }
        else if(this.date.substring(0,2).equals("13")){   this.day=13;  calMounth(); }
        else if(this.date.substring(0,2).equals("14")){   this.day=14;  calMounth(); }
        else if(this.date.substring(0,2).equals("15")){   this.day=15;  calMounth(); }
        else if(this.date.substring(0,2).equals("16")){   this.day=16;  calMounth(); }
        else if(this.date.substring(0,2).equals("17")){   this.day=17;  calMounth(); }
        else if(this.date.substring(0,2).equals("18")){   this.day=18;  calMounth(); }
        else if(this.date.substring(0,2).equals("19")){   this.day=19;  calMounth(); }
        else if(this.date.substring(0,2).equals("20")){   this.day=20;  calMounth(); }
        else if(this.date.substring(0,2).equals("21")){   this.day=21;  calMounth(); }
        else if(this.date.substring(0,2).equals("22")){   this.day=22;  calMounth(); }
        else if(this.date.substring(0,2).equals("23")){   this.day=23;  calMounth(); }
        else if(this.date.substring(0,2).equals("24")){   this.day=24;  calMounth(); }
        else if(this.date.substring(0,2).equals("25")){   this.day=25;  calMounth(); }
        else if(this.date.substring(0,2).equals("26")){   this.day=26;  calMounth(); }
        else if(this.date.substring(0,2).equals("27")){   this.day=27;  calMounth(); }
        else if(this.date.substring(0,2).equals("28")){   this.day=28;  calMounth(); }
        else if(this.date.substring(0,2).equals("29")){   this.day=29;  calMounth(); }
        else if(this.date.substring(0,2).equals("30")){   this.day=30;  calMounth(); }
        else if(this.date.substring(0,2).equals("31")){   this.day=31;  calMounth(); }
        else{
            System.out.println("-------------- day error --------------");
            if(i==1){
                flight a=new flight();
                a.type();
            }
            if(i==2){
                hotel a=new hotel();
                a.chanel();
            }
        }
        
    }
    public void calMounth(){
        if(this.date.substring(3,5).equals("01")){        this.mounth=1;   calYear(); }
        else if(this.date.substring(3,5).equals("02")){   this.mounth=2;   calYear(); }
        else if(this.date.substring(3,5).equals("03")){   this.mounth=3;   calYear(); }
        else if(this.date.substring(3,5).equals("04")){   this.mounth=4;   calYear(); }
        else if(this.date.substring(3,5).equals("05")){   this.mounth=5;   calYear(); }
        else if(this.date.substring(3,5).equals("06")){   this.mounth=6;   calYear(); }
        else if(this.date.substring(3,5).equals("07")){   this.mounth=7;   calYear(); }
        else if(this.date.substring(3,5).equals("08")){   this.mounth=8;    calYear();}
        else if(this.date.substring(3,5).equals("09")){   this.mounth=9;    calYear();}
        else if(this.date.substring(3,5).equals("10")){   this.mounth=10;   calYear(); }
        else if(this.date.substring(3,5).equals("11")){   this.mounth=11;   calYear(); }
        else if(this.date.substring(3,5).equals("12")){   this.mounth=12;   calYear(); }
        else{
            System.out.println("-------------- mounth error --------------");
            flight a1=new flight();
            a1.type();
            if(i==1){
                flight a=new flight();
                a.type();
            }
            if(i==2){
                hotel a=new hotel();
                a.chanel();
            }
        } 
    }
    public void calYear(){
        if(this.date.substring(6).equals("2018")){        this.year=2018;    }
        else if(this.date.substring(6).equals("2019")){   this.year=2019;    }
        else if(this.date.substring(6).equals("2020")){   this.year=2020;    }
        else{
            System.out.println("------------ year error ------------");
            flight a1=new flight();
            a1.type();
            if(i==1){
                flight a=new flight();
                a.type();
            }
            if(i==2){
                hotel a=new hotel();
                a.chanel();
            }
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
