/*
Trace out (or video for me) a description of what is happening in the 
increaseSize() method ofthe CDCollection class. This is important because
this is pretty close to the code that is implemented behind the scenes in the 
ArrayList class that makes it behave so nicely when it is about to run out 
of room !
 */
package weekthree;

public class WeekThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // a description of what is happening in the increaseSize() method ofthe
        // CDCollection class
        
        // cDCollection object 
        CDCollection cdc = new CDCollection();
        
        // added 6 CDs
        // will debug from 5th CD
        cdc.addCD("Into the wild", "N/A", 8, 12);
        cdc.addCD("Moharaja", "Warfaze", 5, 14);
        cdc.addCD("Into the wild", "N/A", 8, 12);
        cdc.addCD("Moharaja", "Warfaze", 5, 14);
        cdc.addCD("Into the wild", "N/A", 8, 12);
        cdc.addCD("Moharaja", "Warfaze", 5, 14);
        
        System.out.println(cdc.toString());
        
    }

}
