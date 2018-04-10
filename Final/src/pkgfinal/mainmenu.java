package pkgfinal;
import java.util.*;
public class mainmenu extends regisLogin{
    mainmenu(){
        System.out.println("============== MENU ==============");
    }
    mainmenu(int x,String n){
        this();
        i=x;
        name[i]=n;
    }
    public void menu(){ 
        Scanner sc= new Scanner(System.in);
        System.out.println("=========== Hello "+name[i]+" ===========");
        System.out.println("PRESS 1     Book flight");
        System.out.println("PRESS 2     Book hotel");
        System.out.println("PRESS 3     Travel Search");
        System.out.println("PRESS 4     Profile");
        System.out.print("please enter number : ");
        String s1 = sc.nextLine();
        if(s1.equals("1")){
            flight a1=new flight(i);
            a1.ch();           
        }else if(s1.equals("2")){
        
        }else if(s1.equals("3")){
        
        }else if(s1.equals("4")){
        
        }else{
            System.out.println("----------- Please try again ---------");
            menu(); 
        }
    }
}
