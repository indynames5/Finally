package pkgfinal;
import java.util.*;
public class Proflie extends mainmenu{
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
        System.out.println(a.i);
        for (int l = 0; l <999; l++) {
            if(a.bsorce[u][l]!=null){
                System.out.println("\nSort : "+a.bsorce[u][l]);
                System.out.println("Destination : "+a.bdtn[u][l]);
                System.out.println("GO Date : "+a.tgo[u][l]);
                if(a.tback[a.i][l]!=null){ 
                    System.out.println("BACK Date : "+a.tback[u][l]);
                }
                System.out.println(a.sAir[u][l]);
                if(a.a[l]==2)System.out.println(a.dAir[u][l]);
                System.out.println("Travel Time : "+a.hr[u][l]+" hr\n");
                System.out.println("-------------------------------------------");
            }
        }
    
    }
    public void ht(){
        hotel b=new hotel("\n---------------- Book Hotel ----------------\n");
        for (int k = 0; k <999; k++) {
            if(b.dhotel[u][k]!=null){
            System.out.println("Date : "+b.dhotel[u][k]);
            System.out.println("Country : "+b.ctr[u][k]);
            System.out.println("Town : "+b.town[u][k]);
            System.out.println("Price :"+b.price[u][k]);
            }
        }System.out.println("-------------------------------------------");
        System.out.println("");
    }
}
