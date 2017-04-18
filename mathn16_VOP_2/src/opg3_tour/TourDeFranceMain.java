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

/**
 *
 * @author Thisen
 */
public class TourDeFranceMain {

    private List<RacingCyclist> list;
    private File filos;
    private String[] racers;
    private RacingCyclist rc;
    
    public TourDeFranceMain(String fileName){
        list = new ArrayList<>();
        filos = new File(fileName);
    }

    public List<RacingCyclist> getList() {
        return list;
    }
    
    public void readFile() {
        try(BufferedReader br = new BufferedReader(new FileReader(filos))){
            String checkForEmpty = br.readLine();
            while(checkForEmpty != null){
                racers = br.readLine().split("\t");
                RacingCyclist rc = new RacingCyclist(racers[0], racers[1], racers[2], racers[3], Integer.parseInt(racers[4]), Integer.parseInt(racers[5]));
                list.add(rc);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void sort(){
        Collections.sort(list, rc.compareTo(list.get(0)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TourDeFranceMain tfm = new TourDeFranceMain("tourdefrance.txt");
    tfm.readFile();         
    System.out.println("List:\n" + tfm.getList().subList(0, 10));
    }
    
}
