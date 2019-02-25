package porkerhand;

import java.util.Scanner;

public class PorkerHand extends evaluatePoker {
    
    PorkerHand(String input) {
        super(input);
        this.input = input;
    }
    public String findBookerHand() {
        if (isPare(getSuits())) {
                   if (isStaright(getSuits())) 
                          return "TWO PARE";
                        else 
                          return "PARE";
                        
        }   else if (isFlush(getRank())) {
                    if (isStaright(getSuits())) 
                     return "STRAIGHT FLUSH";
                   else 
                      return "ROYAL FLUSH";
            

        } 
            else 
                  return "HIGH CARDS";
        
        
          //--TO DO---INCOMPLETE----
        
    }

    public static void main(String[] args) {
        String input;
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE TYPE YOUR CARDS e.g 2S,1C,8D,4S,7H");
        System.out.println("===========================================>");
        input = scan.nextLine();
        System.out.println("===========================================>");

        PorkerHand poker = new PorkerHand(input);
        try {
          result = poker.findBookerHand();
        } catch (Exception e) {
         System.out.println("Wrong string was typed");
        }
        System.out.println(result);
        System.out.println("==============THANK YOU====================>");

    }

}
