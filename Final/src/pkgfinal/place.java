package pkgfinal;

import java.util.Scanner;

public class place {
    place(){
    System.out.println("\n============================================="
                   +   "\n                  TRAVEL SEARCH              "
                   +   "\n=============================================");
    
    }
   public void Place(){ 
    int x = 1 ;
    Scanner input1 = new Scanner(System.in);
    System.out.print("Enter Month  (press 0 exits) --->");
    String Ans = input1.nextLine();
    switch(Ans){
      case "january" :  Jan();    break ;
      case "february": feb()  ;   break ;
      case "march" :    March();  break ;
      case "april" : April() ;break ;
      case "may"   : May() ;break ;
      case "june"  : June() ;break ;
      case "july"  :July() ;break ;
      case "august" : August() ;break ;
      case "september" : September() ;break ;
      case "october" :October() ;break ;
      case "november": November();break ;
      case "december": December() ;break ;
      case "1" :  Jan();    break ;
      case "2": feb()  ;   break ;
      case "3" :    March();  break ;
      case "4" : April() ;break ;
      case "5"   : May() ;break ;
      case "6"  : June() ;break ;
      case "7"  :July() ;break ;
      case "8" : August() ;break ;
      case "9" : September() ;break ;
      case "10" :October() ;break ;
      case "11": November();break ;
      case "12": December() ;break ;
      default:      Place();    
     }

 }
public static void Jan(){
    System.out.println("Bagan,Myanmar");
    System.out.println("This temple town is one of Myanmar’s main attractions. ");
    System.out.println("Once the capital of a powerful ancient kingdom ");
   
}
public static void feb(){
    System.out.println("Sapporo,Japan");
    System.out.println("There will the annual snow festival held in February.");
   }  
public static void March(){
    System.out.println("Boracay, Philippines "); 
    System.out.println("The most beautiful island in Philippines");
    System.out.println("The ocean is full of romantic paraws");
    System.out.println("colourful parasails fill the air");
  }
public static void April(){
System.out.println("Thailand");
System.out.println("During this month Thailand will have Songkran festival ");
}    
public static void May(){
    System.out.println("Bhutan");
    System.out.println("Bhutan is no ordinary place. It is the last great Himalayan kingdom, ");
    System.out.println("shrouded in mystery and magic, where a traditional Buddhist culture ");
    System.out.println("carefully embraces global developments.");    
}
public static void June(){
     System.out.println("Yunnan, China");
     System.out.println("The weather there will be warm you will feel the real nature there");
     System.out.println("with a nice richest view of the Mountain");
}
public static void July(){
  System.out.println("Bali, Indonesian");
  System.out.println("the famed Island of the Gods, with its varied landscape of hills and mountains, ");
  System.out.println("rugged coastlines and sandy beaches, lush rice terraces and barren volcanic hillsides");
  System.out.println(" all providing a picturesque backdrop to its colourful, deeply spiritual and unique culture");
}
public static void August(){
 System.out.println("Mount Kinabalu, Malaysia");
 System.out.println("Mount Kinabalu along with other upland areas of the Crocker Range is known worldwide for its ");
 System.out.println("  botanical and biological species biodiversity with plants of Himalayan, Australasian, and Indomalayan origin.");                  
}
public static void September(){
 System.out.println("Sa Pa, Vietnam");
 System.out.println("Established as a hill station by the French in 1922, Sapa today is the tourism centre of the northwest.");
}
public static void October(){
System.out.println("Kyoto, Japan");
System.out.println("Kyoto is old Japan writ large: atmospheric temples, sublime gardens, traditional teahouses and geisha scurrying to secret liaisons.");
}
public static void November(){
System.out.println("Khone Pha Pheng Waterfall, Laos");
 System.out.println(" Khone Pha Pheng is Southeast Asia’s largest waterfall (by volume) and one of the widest in the world. ");
}
public static void December(){
System.out.println("Plain of Jars, Laos");
System.out.println("Mysterious giant stone jars of unknown ancient origin are scattered over hundreds of hilly square kilometres ");
System.out.println("Phonsavan, giving the area the misleading name of Plain of Jars");

}
}

