package pkgfinal;
import java.util.*;
public class mainmenu {
    static String name; 
    static int u;
    mainmenu(){
        System.out.println("=============================================");
        
    }
    public void mainmenu(String x,int z){
        name=x;
        u=z;
    }
    
    public void menu(){ 
        Scanner sc= new Scanner(System.in);
        System.out.println("                   "+name+"                  "
                        +"\n=============================================");
        System.out.println("PRESS 1     Book flight");
        System.out.println("PRESS 2     Book hotel");
        System.out.println("PRESS 3     Travel Search");
        System.out.println("PRESS 4     Profile");
        System.out.println("PRESS 5     Logout");
        System.out.print("[> ");
        String s1 = sc.nextLine();
        char s2=s1.charAt(0);
        switch (s2) {
            case '1':  
                flight a1 = new flight(u);
                a1.type(); break;
            case '2':  
                hotel a2 = new hotel(u);
                a2.chanel(); break;
            case '3':
                place a3 = new place();
                a3.Place(); break;    
            case '4':   
                Proflie a4 = new Proflie();
                a4.main(); break;
            case '5':
                regisLogin a5 = new regisLogin();
                a5.menu(); break;
            default:System.out.println("----------- Please try again ---------");
            mainmenu a = new mainmenu();
            menu();
        }
    }
}