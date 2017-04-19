package opg1_facade;

/**
 *
 * @author erso
 */
public class SpecialNumbers
{

    public boolean isEven(int x){
        boolean even = false;
        if(x % 2 == 0){
            even = true;
        }return even;
    }

    public boolean isPrime(int x){
        boolean prime = true;
        for(int i = 1; i<x; i++){
            if(x % i == 0){
                prime = false;
            }
        }return prime;
    }

    public boolean isPowerOf2(int x){
        boolean powOfTwo = false;
        if(Math.sqrt(x) % 2 == 0){
            powOfTwo = true;
        }return powOfTwo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        SpecialNumbers sn = new SpecialNumbers();
        int x = 1024;
        int y = 1021;
//        System.out.println("Even\t" + x +": " + sn.isEven(x) + "\t" + y + ": " + sn.isEven(y));
//        System.out.println("Prime\t" + x +": " + sn.isPrime(x) + "\t" + y + ": " + sn.isPrime(y));
//        System.out.println("Pow 2\t" + x +": " + sn.isPowerOf2(x) + "\t" + y + ": " + sn.isPowerOf2(y));

    }

}
