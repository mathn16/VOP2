/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opg2_polymorphi;

/**
 *
 * @author Mathias
 */
public class PrimeChecker implements CheckerInterface{

    @Override
    public boolean check(int i) {
        boolean prime = true;
        int y = (int)(Math.sqrt(i))+1;
        for(int x = 2; x<y; x++){
            if(i % x == 0){
                prime = false;
            }
        }return prime;
    }
    
}
