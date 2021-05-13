
public class QuakeEntry implements Comparable<QuakeEntry>{
	
	private Location myLocation;
	private String title;
	private double depth;
	private double magnitude;

	public QuakeEntry(double lat, double lon, double mag, 
	                  String t, double d) {
		myLocation = new Location(lat,lon);
		
		magnitude = mag;
		title = t;
		depth = d;
	}
	
	public Location getLocation(){
		return myLocation;
	}
	
	public double getMagnitude(){
		return magnitude;
	}
	public String getInfo(){
		return title;
	}
	public double getDepth(){
		return depth;
	}

	@Override
	public int compareTo(QuakeEntry loc) {
         return 0;
            /*            
             String[] str1 = title.split(" ");
             String[] str2 = loc.getInfo().split(" ");
             String one = "";
             if(str1.length-1 >= 0) {
                 one = str1[str1.length-1];
             } else {
                 one = str1[0];
             }
             String two = "";
             if(str2.length-1 >= 0) {
                 two = str2[str2.length-1];
             } else {
                 two = str2[0];
             }                            
             int range = 0;
             if (one.length()<=two.length()) {
                 range = one.length();
             }
             if (one.length()>=two.length()) {
                 range = two.length();
             }             
             for (int i = 0; i < range-1; i++) {
                 if (one.charAt(i) < two.charAt(i)) {
                     return -1;
                 }
                 if (one.charAt(i) > two.charAt(i)) {
                     return 1;
                 }                                 
             }
             if (one.equals(two)) {
                 if (magnitude < loc.getMagnitude()) {
                     return -1;
                 }
                 if (magnitude > loc.getMagnitude()) {
                     return 1;
                 }                       
             }
             return 0;
             */
             
               
             //return Double.compare(magnitude, loc.getMagnitude());
	    // Here is another way to sort by Magnitude
	    /*
	    if (magnitude < loc.getMagnitude()){
	        return -1;
	       }
	    if (magnitude > loc.getMagnitude()){
	        return 1;
	       }
             if (magnitude == loc.getMagnitude()) {
                 if (depth < loc.getDepth()) return -1;
                 if (depth > loc.getDepth()) return 1;
                 return 0;
             }
	    return 0;
	    
	    */
	    
	   //  Below here sorts by Location
	    /*
		double difflat = myLocation.getLatitude() - loc.myLocation.getLatitude();
		if (Math.abs(difflat) < 0.001) {
			double diff = myLocation.getLongitude() - loc.myLocation.getLongitude();
			if (diff < 0) return -1;
			if (diff > 0) return 1;
			return 0;
		}
		if (difflat < 0) return -1;
		if (difflat > 0) return 1;
		
		
		// never reached
		return 0;
		*/
	} 
	
	public String toString(){
		return String.format("(%3.2f, %3.2f), mag = %3.2f, depth = %3.2f, title = %s", myLocation.getLatitude(),myLocation.getLongitude(),magnitude,depth,title);
	}
	
}