package pkgfinal;
import java.util.*;
public class go implements  country {
    String ct,ctu,goWhere; int k=0,go;
    double  lti,lgt;
    public void ccome(String x, int l){
        int k=l;
        ct=x;
        int i=0,j=1;
        Scanner sc= new Scanner(System.in);
        ctu = ct.toUpperCase();
        for(;i<20;i++){
            if(ctu.equals(ctr[i][0])){
                do{
                    if(!ctr[i][j].equals("")){      
                        k=i;
                        System.out.println("Enter number "+j+" "+ctr[i][j]);
                        lti=lati[i][j];
                        lgt=longti[i][j];
                    }
                    j++;
                }while(j!=5);i=20;
            }else{k=-1;}
        }if(k==-1){
            System.out.println("-------------- error --------------");
            if(k==1){
                flight a=new flight();
                a.type();
            }
            if(k==2){
                hotel a=new hotel();
                a.chanel();
            }
        }
        System.out.print("[> ");
        go=sc.nextInt();
        System.out.println("");
        goWhere=ctr[k][go];
    }
    
    public String getWhere(){
    return goWhere;
    }      
    double getlti(){
    return lti;
    }
    double getlgt(){
    return lgt;
    }

}
