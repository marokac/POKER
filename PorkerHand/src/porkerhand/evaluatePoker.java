package porkerhand;

import java.util.Arrays;

/**
 *
 * @author Cedric
 */
public class evaluatePoker {

    String input;

    evaluatePoker(String input) {
        this.input = input;
    }

    
    //get suits
    public String[] getSuits() {
        String suits[] = new String[5];
        String[] temb;
        temb = input.split(",");
        for (int a = 0; a < temb.length; a++) {
            suits[a] = temb[a].substring(0, 1);
        }
        return suits;
    }

    //Get Ranks
    public String[] getRank() {
        String rank[] = new String[5];
        String[] temb;
        temb = input.split(",");
        for (int a = 0; a < temb.length; a++) {
            rank[a] = temb[a].substring(temb[a].length() - 1);
        }
        return rank;
    }

    // check if is Flush
    boolean isFlush(String[] sts) {
        String first = sts[0];
        int count = 0;
        for (String st : sts) {
            if (sts[1].equals(first)) {
                count++;
            }
        }
        return count == 5;
    }

   // Checks  if is str8
    boolean isStaright(String[] sts) {
        int count = 0;
        Arrays.sort(sts);
        for (int i = 0; i < sts.length; i++) {
            if (i < sts.length - 1) {
                if ((Integer.parseInt(sts[i + 1])) - (Integer.parseInt(sts[i])) == 1) {
                    count++;
                }
            }
        }
        return count == 4;
    }

     // Checks  if is pare
    boolean isPare(String[] pare) {
        Arrays.sort(pare);
        int count = 0;
        for (int i = 0; i < pare.length; i++) {
            for (int k = i + 1; k < pare.length - 1; k++) {
                if (Integer.parseInt(pare[i]) == Integer.parseInt(pare[k])) {
                    count++;
                }

            }

        }
        return count >= 1;
    }
    
    
    //--TO DO---INCOMPLETE----
}
