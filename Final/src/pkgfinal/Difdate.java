package pkgfinal;
import java.time.LocalDate;
import java.time.Period;

class Difdate {
    private int day,mounth,year,dd,mm,yy;
    
    Difdate(int y,int m,int d){
       year=y;
       mounth=m;
       day=d;  
       dif();
    }
    private void  dif(){
        LocalDate pdate = LocalDate.of(year, mounth, day);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(now,pdate);
        yy=diff.getYears(); 
        mm=diff.getMonths(); 
        dd=diff.getDays();
    }
    public int getdd(){
    return dd;
    }
    public int getmm(){
    return mm;
    }
    public int getyy(){
    return yy;
    }
}
