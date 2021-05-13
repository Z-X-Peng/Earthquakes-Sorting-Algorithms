
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TitleAndMagnitudeComparator implements Comparator<QuakeEntry> {
        public int compare(QuakeEntry qe1, QuakeEntry qe2) {

             String[] str1 = qe1.getInfo().split(" ");
             String[] str2 = qe2.getInfo().split(" ");
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
                 if (qe1.getMagnitude() < qe2.getMagnitude()) {
                     return -1;
                 }
                 if (qe1.getMagnitude() > qe2.getMagnitude()) {
                     return 1;
                 }                       
             }
             return 0;
            
    }
}
