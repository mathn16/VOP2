/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opg3_tour;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Thisen
 */
public class CountryMountainComparator implements Comparator<RacingCyclist> {
    
    /**
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(RacingCyclist o1, RacingCyclist o2){
        int nationality = 0;
        if(o1.getCountry().compareTo(o2.getCountry()) != 0){
            nationality = o1.getCountry().compareTo(o2.getCountry());
        }else if(o1.getCountry().compareTo(o2.getCountry()) == 0){
            nationality = Integer.compare(o1.getMountains(), o2.getMountains());
        }return nationality;
    }
}
