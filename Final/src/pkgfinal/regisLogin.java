package pkgfinal;
import java.util.*;
public class regisLogin extends idpw{   
    
    public void regis(){        
        Scanner sc = new Scanner (System.in);        
        System.out.println("============================================="
                       + "\n                   REGISTER                  "
                       + "\n=============================================");
        System.out.print("ID               : ");
        String idr=sc.nextLine();
        System.out.print("Password         : ");
        String pwr=sc.nextLine();
        System.out.print("confirm Password : ");
        String pwr1=sc.nextLine();
        System.out.print("Name             : ");
        String namer=sc.nextLine();
       
        for(int z=0;z<=id.length-1;z++){
            if(!pwr.equals(pwr1)){  
                System.out.println("----------- password does not match ---------\n");    
                regis();                        
            }
            else if(idr.equals(id[z])){
                System.out.println("--------------- Don't use it ----------------\n");
                z=id.length;    regis();
            }else if(!pwr.equals(pwr1)&&idr.equals(id[z])){
                System.out.println("----------- password does not match ---------\n");
                System.out.println("--------------- Don't use it ----------------\n");

                
            }else{
                if(id[z]==null  && pw[z]==null){
                    System.out.println("------------------ success ------------------\n");
                    super.id[z]=idr;  super.pw[z]=pwr;  super.name[z]=namer;
                    z=id.length; menu();
                }
            }
        }
   }
    public void login(){        
        int l=-1;
        Scanner sc = new Scanner (System.in);  
        System.out.println("============================================="
                       + "\n                     LOGIN                   "
                       + "\n=============================================");
        System.out.print("ID               : ");
        String idi=sc.nextLine();
        System.out.print("Password         : ");
        String pwi=sc.nextLine();
        for(int z=0;z<=id.length-1;z++){
            if(idi.equals(id[z])&&pwi.equals(pw[z])){
                System.out.println("------------------ success ------------------\n"); i=z; 
                mainmenu m = new mainmenu();
                m.mainmenu(name[i],i);
                m.menu();       
            }
        }if(l==-1){ System.out.println("-------------- Please try again -------------\n");
         menu();}
    }    
    public void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("PRESS 1   REGISTER ");
        System.out.println("PRESS 2   LOGIN    ");
        System.out.print("[> ");
        int a = sc.nextInt();
        if(a==1){      System.out.println("\n");                   regis(); }
        else if(a==2){ System.out.println("\n");                   login(); }
        else{ System.out.println("1 or 2 please try again\n");     menu();  } 
    }

}
    