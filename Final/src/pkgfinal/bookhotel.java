package pkgfinal;
import java.util.*;
public class bookhotel implements hotellist {
    private String town,twn,goWhere;
    int cost,k=-1,go,room;
     public static String dhotel[]=new String[999];
     public static String namehotel[]=new String[999];
     public static int nhotel[]=new int[999];
     public void ccome(String x){
        town=x;
        int i=0,j=1;
        Scanner sc= new Scanner(System.in);
       
        for(;i<36;i++){
            if(town.equals(hotel[i][0])){
                do{
                    if(!hotel[i][j].equals("")){
                        k=i;
                        System.out.println("Enter number "+j+" "+hotel[i][j]);
                        cost=cht[i][j];
                    }
                    j++;
                }while(j!=5);i=36;
            }else{k=-1;}
        }if(k==-1){
            System.out.println("-------------- error --------------");
            hotel a=new hotel();
            a.chanel();
        }
        System.out.print("[> ");
        go=sc.nextInt();
        System.out.println("");
        goWhere=hotel[k][go];
     }

    public String getHotel(){
    return goWhere;
    }
    public int getCost(){
    return cost;
    }

}

