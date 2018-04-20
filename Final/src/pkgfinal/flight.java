package pkgfinal;
import java.util.*;
public class flight extends option1 {
    static int i,type;
    static String sorce,dtn,godate,bdate;
    static int goday,gomounth,goyear;
    static int todsorce, tomsorce, toysorce;
    static double   slati,slgt,dlati,dlgt,dc;
    
    flight(){
        System.out.println("\n============================================="
                       +   "\n                  BOOK FLIGHT                "
                       +   "\n=============================================");
    }

    flight(int x){
        this();
        this.i=x;
    }   
    flight(String c){
        System.out.println(c);
    }

    void type(){     
        System.out.println(i);
        Scanner cr= new Scanner(System.in);
        System.out.println("press 1 ONEWAY");
        System.out.println("press 2 ROUND TRIP");
        System.out.print("[>");
        type=cr.nextInt();
        a[j]=type;
        
        System.out.println("");
        ch();
    }
    public void ch(){
        go a = new go();
        Scanner sc= new Scanner(System.in);
        System.out.print("Sorce           --->");
        sorce=sc.nextLine();
        a.ccome(sorce,1);
        super.bsorce[i][j]=a.getWhere();
        slati=a.getlti();
        slgt=a.getlgt();
        System.out.print("Destination     --->");
        dtn=sc.nextLine();
        a.ccome(dtn,1);
        dlati=a.getlti();
        dlgt=a.getlgt();
        super.bdtn[i][j]=a.getWhere();
        getDate();
    }
    public void getDate(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Departure Date  --->");
        godate=sc.nextLine(); 
        date a = new date ();
        a.date(godate,1);
        a.calDay();
        goday=a.getDay(); 
        gomounth=a.getMounth(); 
        goyear=a.getYear(); 
        super.tgo[i][j]=goday+"/"+gomounth+"/"+goyear;                    
        if(type==2){
            
            System.out.print("Return Date     --->");
            bdate=sc.nextLine(); 
            a.date(bdate,2);
            a.calDay();
            int bday=a.getDay(); 
            int bmounth=a.getMounth(); 
            int byear=a.getYear();
            super.tback[i][j]=bday+"/"+bmounth+"/"+byear;
        }  
        ddif();
    }
    public void ddif(){
        Difdate di = new Difdate(goyear,gomounth,goday);
        int dd=di.getdd() , mm=di.getmm() , yy=di.getyy();
        if(dd==0 && mm==0 && yy==0)  super.tosorce[i][j]="today";
        if(mm==0 && yy==0) super.tosorce[i][j]=dd+" day ";
        if(yy==0)super.tosorce[i][j]=dd+" day "+mm+" mounth ";
        if(mm==0)super.tosorce[i][j]=dd+" day "+yy+" year ";
        if(dd==0)super.tosorce[i][j] = mm+" mounth "+yy+" year ";
        if(dd!=0 &&mm!=0&& yy!=0)super.tosorce[i][j] = dd+" day "+mm+" mounth "+yy+" year ";
        if(dd>15) dc=0.995;
        if(mm>1) dc=0.99;
        if(mm>5) dc=0.98;
        if(yy>1) dc=0.95;
        price();
    }
    public void price(){
        String classes = null;
        int clas=0,ro =0,l,nflight,tfly;
        double high = 0;
        double sx[]=new double[3];
        String sy[]=new String [3];
        String dy[]=new String [3];
        int sz[]=new int[3];
        int dz[]=new int[3];
        price a = new price();
        Scanner sc=new Scanner(System.in);
        a.setXy(slati, slgt, dlati, dlgt);
        a.calprice();
        hr[i][j]=a.getTime();
        if(hr[i][j]==0) hr[i][j]=1;
        int p=a.getPrice();
        Random r = new Random() ;
        if(gomounth==12 || gomounth==1){ high=1.3;}
        if(sorce=="japan"&&gomounth==2){ high=1.3; }
        if(sorce=="philippines"&&gomounth==3){ high=1.3; }
        if(sorce=="thailand"&&gomounth==4){ high=1.3; }
        if(sorce=="bhutan"&&gomounth==5){ high=1.3; }
        if(sorce=="china"&&gomounth==6){ high=1.3; }
        if(sorce=="indonesia"&&gomounth==7){ high=1.3; }
        if(sorce=="malaysia"&&gomounth==8){ high=1.3; }
        if(sorce=="vietnam"&&gomounth==9){ high=1.3; }
        if(sorce=="japan"&&gomounth==10){ high=1.3; }
        if(sorce=="laos"&&gomounth==11){ high=1.3; }
        
        
        
        for (int k = 0; k <sy.length; k++) {
            nflight=r.nextInt(20);
            sy[k]=airline[nflight];
            if(type==2){    nflight=r.nextInt(20);
                            dy[k]=airline[nflight];}
        }
        for (int k = 0; k <sz.length; k++) {
            tfly=r.nextInt(15);
            sz[k]=tfly;
            if(type==2){ tfly=r.nextInt(15);
                         dz[k]=tfly;}
        }
        while( ro==0 ){
        System.out.println("Class "+
                        "\n1 : First Class      "
                      + "\n2 : Business Class   "
                      + "\n3 : Economy Class    ");
            System.out.print("[> ");
        int ip=sc.nextInt();
        if(ip==1){
            super.cls[i][j]="First Class";
            clas=3; ro=-1;
        }else if(ip==2){ 
            super.cls[i][j]="Business Class";
            clas=2; ro=-1;
        }else if(ip==3){
            super.cls[i][j]="Economy Class";
            clas=1; ro=-1;
        }
        }
        for (int k = 0; k <sx.length; k++) {
            l=r.nextInt(1000);
            if (high==0)sx[k]=(int)((p*clas)+l);
            else sx[k]=(int)((((p*clas)+l)*dc)*high);
            if(type==2) sx[k]*=2;
        }
        System.out.println("\n"+cls[i][j]);
        for (int k = 0; k < sz.length; k++) {
            System.out.println((k+1)+" "+sy[k]+": Start at Time "+sz[k]+".00 "+(sx[k])+" THB"
                            + "\n Travel time : "+hr[i][j] +" hr");
            if(type==2){
                System.out.println("  "+dy[k]+": Start at Time"+dz[k]+".00 ");
            }
        }
        System.out.print("[> ");
        int ch=sc.nextInt();
        super.price[i][j]=(int)sx[ch-1];
        super.sAir[i][j]=sy[ch-1]+sz[ch-1]+".00 ";
        if(type==2) super.dAir[i][j]=dy[ch-1]+": "+dz[ch-1]+".00 ";    
        print();
    }
    public void print() {
        Scanner sc = new Scanner(System.in);
        int sum,a=0;
        System.out.println("\nSort : "+super.bsorce[i][j]);
        System.out.println("Destination : "+super.bdtn[i][j]);
        System.out.println("Departure Date : "+super.tgo[i][j]);
        if(type==2) System.out.println("Return Date : "+super.tback[i][j]);
        System.out.println("You have a flight the next "+super.tosorce[i][j]);
        System.out.println(super.sAir[i][j]);
        if(type==2)System.out.println(super.dAir[i][j]);
        System.out.println("Travel Time :"+hr[i][j]+" hr");
        System.out.println("Price : "+super.price[i][j]);
        do{    System.out.print("Enter you money : ");
           int money=sc.nextInt();
           if((money-price[i][j])>0){
               sum = money-price[i][j];
               System.out.println("Charge :"+sum);
               System.out.println("------------------ success ------------------\n");
               a=1;
           }else{
               System.out.println("-------------------- error ------------------\n");
           }
        }while(a!=1);
        j++;
        mainmenu m = new mainmenu();
        m.menu();
    }
}