package pkgfinal;
import java.util.*;
public class Proflie {
    public void main (){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n============================================="
                       + "\n                   PROFILE                   "
                       + "\n=============================================");
        System.out.println("1 : Book Flight");
        System.out.println("2 : Book Hotel");
        System.out.println("3 : Exit");
        int x = sc.nextInt();
        if(x==1) fi();
        if(x==2) ht();
        if(x==3){     mainmenu m = new mainmenu();
                      m.menu();
        }else main(); 
        
        
    }    
    public void fi(){
        flight a=new flight("\n---------------- Book Flight ----------------\n");
        for (int l = 0; l <999; l++) {
            if(a.bsorce[a.i][l]!=null){
                System.out.println("\nSort : "+a.bsorce[a.i][l]);
                System.out.println("Destination : "+a.bdtn[a.i][l]);
                System.out.println("GO Date : "+a.tgo[a.i][l]);
                if(a.tback[a.i][l]!=null){ 
                    System.out.println("BACK Date : "+a.tback[a.i][l]);
                }
                System.out.println(a.sAir[a.i][l]);
                if(a.a[l]==2)System.out.println(a.dAir[a.i][l]);
                System.out.println("Travel Time : "+a.hr[a.i][l]+" hr");
                System.out.println("-------------------------------------------");
            }
        }
    
    }
    public void ht(){
        hotel b=new hotel("\n---------------- Book Hotel ----------------\n");
        for (int k = 0; k <999; k++) {
            if(b.dhotel[b.l][k]!=null){
            System.out.println("Date : "+b.dhotel[b.l][k]);
            System.out.println("Country : "+b.ctr[b.l][k]);
            System.out.println("Town : "+b.town[b.l][k]);
            System.out.println("Price :"+b.price[b.l][k]);
            }
        }System.out.println("-------------------------------------------");
        System.out.println("");
    }
}
