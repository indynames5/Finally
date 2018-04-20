package pkgfinal;
import java.util.*;
public class hotel extends option2 implements hotellist{
    static public String country,bdate;
    static int l,cday,cmounth,cyear,room, zx,zc,zv;
    static double high;
    hotel(){
        System.out.println("\n============================================="
                       +   "\n                  BOOK HOTEL                 "
                       +   "\n=============================================");    
    }
    hotel(int x){
        this();
        l=x;
    }
    hotel(String c){
        System.out.println(c);
    }
    void chanel(){
        int zx;
        go a = new go();
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.print("Date          --->");
        bdate=sc.nextLine(); 
        dhotel[l][k]=bdate;
        date c = new date ();
        c.date(bdate,2);
        c.calDay();
        cmounth=c.getMounth(); 
        System.out.print("country       --->");
        country=sc.nextLine();
        a.ccome(country,2);
        ctr[l][k]=country;
        super.town[l][k]=a.getWhere();
        String tn=town[l][k];
        bookhotel b = new bookhotel();
        b.ccome(tn);
        super.hotel[l][k]=b.getHotel();
        int prc=b.getCost();
        System.out.println("How many room --->");
        System.out.print("[> ");
        room=ac.nextInt();
        if(cmounth==12 || cmounth==1){ high=1.3;}
        if(country=="japan"&&cmounth==2){ high=1.3; }
        if(country=="philippines"&&cmounth==3){ high=1.3; }
        if(country=="thailand"&&cmounth==4){ high=1.3; }
        if(country=="bhutan"&&cmounth==5){ high=1.3; }
        if(country=="china"&&cmounth==6){ high=1.3; }
        if(country=="indonesia"&&cmounth==7){ high=1.3; }
        if(country=="malaysia"&&cmounth==8){ high=1.3; }
        if(country=="vietnam"&&cmounth==9){ high=1.3; }
        if(country=="japan"&&cmounth==10){ high=1.3; }
        if(country=="laos"&&cmounth==11){ high=1.3; }
        prc*=room;
        if(high==0) price[l][k]=(int)(prc);
        else price[l][k]=(int)(prc*high);
        print();
    }
        public void print(){
            Scanner sc = new Scanner(System.in);
            int sum,a=0;
            System.out.println("Date : "+dhotel[l][k]);
            System.out.println("Country : "+ctr[l][k]);
            System.out.println("Town : "+town[l][k]);
            System.out.println("Price :"+price[l][k]);
            do{    System.out.print("Enter you money : ");
            int money=sc.nextInt();
            if((money-price[l][k])>0){
               sum = money-price[l][k];
               System.out.println("Charge :"+sum);
               System.out.println("------------------ success ------------------\n");
               a=1;
           }else{
               System.out.println("-------------------- error ------------------\n");
           }
        }while(a!=1);
        k++;
        mainmenu m = new mainmenu();
        m.menu();
            
        }
    }

