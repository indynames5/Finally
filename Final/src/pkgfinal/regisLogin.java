package pkgfinal;
import java.util.*;
public class regisLogin extends idpw{   
    regisLogin(){
        
    }
    public void regis(){        
        Scanner sc = new Scanner (System.in);        
        System.out.println("============ REGISTER =============");
        System.out.print("ID               : ");
        String idr=sc.nextLine();
        System.out.print("Password         : ");
        String pwr=sc.nextLine();
        System.out.print("confirm Password : ");
        String pwr1=sc.nextLine();
        System.out.print("Name             : ");
        String namer=sc.nextLine();
        if(!pwr.equals(pwr1)){  
            System.out.println("----- password does not match -----\n");    
            regis();                        
        }
        for(int z=0;z<=id.length-1;z++){
            if(idr.equals(id[z])){
                System.out.println("---------- Don't use it ----------\n");
                z=id.length;    regis();
            }else{
                if(id[z]==null  && pw[z]==null){
                    System.out.println("-------------- success -------------\n");
                    super.id[z]=idr;  super.pw[z]=pwr;  super.name[z]=namer;
                    z=id.length; menu();
                }
            }
        }
   }
    public void login(){        
        int l=-1;
        Scanner sc = new Scanner (System.in);  
        System.out.println("============== LOGIN ==============");
        System.out.print("ID               : ");
        String idi=sc.nextLine();
        System.out.print("Password         : ");
        String pwi=sc.nextLine();
        for(int z=0;z<=id.length-1;z++){
            if(idi.equals(id[z])&&pwi.equals(pw[z])){
                System.out.println("------------- success -------------\n"); i=z; l=z;
                mainmenu a=new mainmenu(i,super.name[i]);
                a.menu();
            }
        }if(l==-1){ System.out.println("----------- Please try again1 ---------\n");
         menu();}
    }    
    public void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("PRESS 1   REGISTER ");
        System.out.println("PRESS 2   LOGIN    ");
        System.out.print("please enter number : ");
        int a = sc.nextInt();
        if(a==1){      System.out.println("\n");                   regis(); }
        else if(a==2){ System.out.println("\n");                   login(); }
        else{ System.out.println("1 or 2 please try again\n"); menu();  } 
    }
}
