
package opg3_tour;

/**
 *
 * @author erso
 */
public class RacingCyclist implements Comparable<RacingCyclist>{
   
    private String name;
    private String team;
    private String country;

    private String time;
    private int mountains;
    private int points;

    public RacingCyclist(String name, String team, String country, String time, int mountains, int points){
        this.name = name;
        this.team = team;
        this.country = country;
        this.time = time;
        this.mountains = mountains;
        this.points = points;
    }


    @Override
    public String toString()
    {
        return getName() + " " + getTeam() + " " + getCountry() + " " + getTime() + " " + getMountains() + " " + getPoints() + "\n";
    }


    
    @Override
    public int compareTo(RacingCyclist o){
        String[] timeArray;
        timeArray = getTime().split(":");
        String hours = timeArray[0];
        String minutes = timeArray[1];
        String seconds = timeArray[2];
        String total = hours + minutes + seconds;
        int timedif = Integer.parseInt(total);
        if(timedif < o.getTime())
        return timedif;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @return the mountains
     */
    public int getMountains() {
        return mountains;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }


}
