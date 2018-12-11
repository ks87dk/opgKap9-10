import java.util.Random;

/**
 * @Author Burhan Öztürk
 * @version 1.0
 *
 */
public class kap9_opg4 {
    //main method

    /*  (Use the Random class) Write a program that creates a Random object with seed  *
        1000 and displays the first 50 random integers between 0 and 100 using the     *
        nextInt(100) method.
    */
    public static void main(String[] args) {
        java.util.Random tilfældigtTal = new java.util.Random(1000);  //generer et tilfældigt tal mellem 0 og 1000
            //eller: Random rand = new Random(1000);
        /**
         * *
         *En metode, som har flere for løkker.
         * <p>
         * En for løkke, som kører fra 1 til 50, som udskriver en tilfældigt tal op til 100.
         * Derudover er der en if løkke, som printer en linje, når rest af n er ligemed 0
         */

        for (int n = 1; n <= 50; n++) {     // for loop for variablen n som tæller indtil 50
            System.out.printf("%2d ", tilfældigtTal.nextInt(100)); //printer random number op til 100, mens n<= 50
            if (n % 10 == 0)
                System.out.println();       // når der er flere end 10 print pr. række, skiftes der linje
            
        }
    }
}
