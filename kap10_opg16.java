import com.sun.org.apache.xpath.internal.operations.Equals;


//  (Divisible by 2 or 3) Find the first 10 numbers with 50 decimal digits that are divisible by 2 or 3


import java.math.BigInteger;


public class kap10_opg16 {
    //main method

    public static void main(String[] args) {

        BigInteger bigNum = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 1;
        BigInteger bigSheet = new BigInteger("0");


        while (count <= 10)  {


            /* herunder, hvis tallet er muligt at dividere vil remainderen være nul, derfor printes resultatet
                og variablen count tillægges 1 og loopet fortsætter indtil count er 10
             */

            do {  (bigSheet.compareTo(bigNum.remainder(new BigInteger("2")))) == 0 ||
                    bigSheet.compareTo(bigNum.remainder(new BigInteger("3"))) == 0 {
                        System.out.println(bigNum);
                        count++;
            }

            bigNum = bigNum.add(BigInteger.ONE);    //her tillægges der 1 til variablen bigNum, når ovenstående er true


        }
    }
}
