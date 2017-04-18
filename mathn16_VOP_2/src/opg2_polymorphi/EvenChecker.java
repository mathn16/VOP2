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
public class EvenChecker implements CheckerInterface {

    @Override
    public boolean check(int i) {
        boolean even = false;
        if(i % 2 == 0){
            even = true;
        }return even;
    }
    
}
