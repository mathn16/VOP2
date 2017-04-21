/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opg3_tour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Thisen
 */
public class TourDeFranceMain {

    private List<RacingCyclist> list;
    private File filos;
    private String[] racers;
    private RacingCyclist rc;
    private Set<RacingCyclist> racerSet;
    
    public TourDeFranceMain(String fileName){
        list = new ArrayList<>();
        filos = new File(fileName);
    }

    public List<RacingCyclist> getList() {
        return list;
    }
    
    public void readFile() {
        try(BufferedReader br = new BufferedReader(new FileReader(filos))){
            String checkForEmpty;
            while((checkForEmpty = br.readLine()) != null){
                racers = checkForEmpty.split("\t");
                rc = new RacingCyclist(racers[0], racers[1], racers[2], racers[3], Integer.parseInt(racers[4]), Integer.parseInt(racers[5]));
                list.add(rc);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void sort(){
        Collections.sort(list, new Comparator<RacingCyclist>() {
            @Override
            public int compare(RacingCyclist o1, RacingCyclist o2) {
                return o1.compareTo(o2);
            }
        });
    }
    
    public Set<RacingCyclist> makeSortedSet(Comparator comp){
        racerSet = new TreeSet<>(comp);
        for(RacingCyclist r : list) {
            racerSet.add(r);
        }
        return racerSet;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TourDeFranceMain tfm = new TourDeFranceMain("tourdefrance.txt");
        
//        tfm.readFile();
//        System.out.println("List:\n" + tfm.getList().subList(0, 10));
//
//        tfm.sort();
//        System.out.println("Sort:\n" + tfm.getList().subList(0, 10));
//        
//        Comparator<RacingCyclist> comp = new CountryMountainComparator();
//        Set<RacingCyclist> countryMountainSet = tfm.makeSortedSet(comp);
//        System.out.println("Country/Mountain:\n" + countryMountainSet);
//        
    }
    
}
