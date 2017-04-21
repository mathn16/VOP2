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
public class PowerOf2Checker implements CheckerInterface {

    @Override
    public boolean check(int i) {
        boolean powOfTwo = false;
        double y = Math.sqrt(i);
        if(y == (int)y){
            powOfTwo = true;
        }return powOfTwo;
    }
    
}
