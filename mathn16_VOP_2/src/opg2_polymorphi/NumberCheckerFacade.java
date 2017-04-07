package opg2_polymorphi;

import java.util.List;

/**
 *
 * @author erso
 */
public class NumberCheckerFacade
{

    public List<Integer> checkNumbers(int min, int max, CheckerInterface checker)
    {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        NumberCheckerFacade ncf = new NumberCheckerFacade();

        CheckerInterface checker;
        
//        checker = new EvenChecker();
//        System.out.println("Evens: " + ncf.checkNumbers(10, 100, checker));
//
//        checker = new PrimeChecker();
//        System.out.println("Primes: " + ncf.checkNumbers(10, 100, checker));
//
//        checker = new PowerOf2Checker();
//        System.out.println("Powers of 2: " + ncf.checkNumbers(10, 100, checker));

    }

}
