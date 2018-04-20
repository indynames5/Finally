package pkgfinal;
class price {
    private double x1,x2,y1,y2,distance  ;
    public int time,price;
    public void setXy(double q,double w,double e,double r){
             this.x1=q; 
             this.y1=w; 
             this.x2=e;
             this.y2=r;
    }
    public void calprice(){
        double z1 = (x1-x2) ;
        double z2 = (y1-y2) ;
        double z3 = z1*z1;
        double z4 = z2*z2;
        double z5 = z3+z4;
        double z6 = Math.sqrt(z5);
        double distance = z6/(1/108.4); 
        price = ((int)distance)*10;
        time = ((int)distance)/700;
    }
    public int getPrice(){
        return price;
    }
    public int getTime(){
        return time;
    }

 


}
