
/**
 * Write a description of class DifferentSorters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Collections;
import java.util.*;

public class DifferentSorters {
    public void sortWithCompareTo() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "EfficientSortStarterProgram/Source Packages/data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list);
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }

    }        
    
    
    public void sortByMagnitude() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "C:/Users/Administrator/Desktop/java/Java Programming and Software Engineering Fundamentals Specialization/EfficientSortStarterProgram/data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
  
        Collections.sort(list, new MagnitudeComparator());        
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
        
    }

    
    public void sortByTitleAndMagnitude() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "C:/Users/Administrator/Desktop/java/Java Programming and Software Engineering Fundamentals Specialization/EfficientSortStarterProgram/data/earthQuakeDataWeekDec6sample1.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);

        if(list == null) {
            System.out.println("the list is null");
        } else {
            System.out.println("the list is not null");
        }     
        Collections.sort(list, new TitleAndMagnitudeComparator());        
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
        
        int quakeNumber = 500;
        System.out.println("Print quake entry in position " + quakeNumber);
        System.out.println(list.get(quakeNumber));        
        System.out.println("# quakes = "+list.size());
    }    
    
    
    
    public void sortByDistance() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        // Location is Durham, NC
        Location where = new Location(35.9886, -78.9072);
        Collections.sort(list, new DistanceComparator(where));
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }

    }
}
