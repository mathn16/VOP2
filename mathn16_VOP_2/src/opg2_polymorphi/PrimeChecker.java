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
        boolean prime = false;
        for(int x = 0; x<i; x++){
            if(i % x == 0){
                prime = true;
            }
        }return prime;
    }
    
}