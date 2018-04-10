package pkgfinal;
import java.util.*;   
abstract public class data {
    public String ctr[][]={ {"CHINA","PAKJING","SHANGHAI","HONG KONG","CHONGQING"},
                            {"RUSIA","MOSCOW","ST.PETERSBURG","KAZAN","BREMEN"},
                            {"INDIA","BANGALORE","NEW DELHI","COIMBRA"},
                            {"THAI","BANKOK","PHUKET","CHIANG MAI"},
                            {"MYANMAR","NAYPYDAW","YANGON"},
                            {"MALAYSIA","KUALA LUMPUR","MUKAH"},
                            {"PHILIPPINES","MANILA","DAVAO"},
                            {"VIETNAM","HO CHI MINH","DA NANG"},
                            {"INDONEESIA","JAKARTA","SURABAYA"},
                            {"JAPAN","NARITA","HIROSHIMA"},
                            {"SOUTH KOREA","SOUL","BUSAN"},
                            {"NORTH KOREA","PYONGYANG"},
                            {"CAMBODIA","PHNOM PENH"},
                            {"TAJIKISTAN","DUSHANBE"},
                            {"UZBEKISTAN","TASHKENT"},
                            {"TURKMENISTAN","ASHGABAT"},
                            {"KAZAKHSTAN","ASTANA"},
                            {"BANGLADESH","DHAKA"},
                            {"BHUTAN","THIMPHU"},
                            {"NEPAL","KATHMANDU"}                                   }; //20
     
    GregorianCalendar time = new GregorianCalendar();
    public int cyr=time.get(Calendar.YEAR),cmt=time.get(Calendar.MONTH),cdy=time.get(Calendar.DATE),
               chr=time.get(Calendar.HOUR),cmn=time.get(Calendar.MINUTE),csc=time.get(Calendar.SECOND);
    
    abstract public void getDate();

}
