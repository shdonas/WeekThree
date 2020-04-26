
package weekthree;

import java.text.NumberFormat;

public class CDCollection 
{
   private CD[] collection;
   private int count;
   private double totalCost;

   //-----------------------------------------------------------------
   //  Constructor: Creates an initially empty collection.
   //-----------------------------------------------------------------
   public CDCollection ()
   {
      // changed the value to 5 to make life easy while debugging
      collection = new CD[5];
      count = 0;
      totalCost = 0.0;
   }

   //-----------------------------------------------------------------
   //  Adds a CD to the col/ary.
   //-----------------------------------------------------------------
   public void addCD (String title, String artist, double cost,
                      int tracks)
   {
       
       // now it will get inside the if
       // as count is 5
      if (count == collection.length)
         increaseSize();

      collection[count] = new CD (title, artist, cost, tracks);
      totalCost += cost;
      count++;
   }

   //-----------------------------------------------------------------
   //  Returns a report describing the CD collection.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nCD List:\n\n";

      for (int cd = 0; cd < count; cd++)
         report += collection[cd].toString() + "\n";

      return report;
   }

   //-----------------------------------------------------------------
   //  Increases the capacity of the collection by creating a
   //  larger array and copying the existing collection into it.
   //-----------------------------------------------------------------
   private void increaseSize ()
   {
       // creating a new array 'temp' to increase the array length
       // new length will be 10 instade of 5
       
      CD[] temp = new CD[collection.length * 2];

      
      for (int cd = 0; cd < collection.length; cd++){
         temp[cd] = collection[cd];          
      }
      // here is a bug 
      // the collection doesnt have all the entry from temp
      //collection = temp;
      // go i cloned it
      collection = temp.clone();
      
      for (int i = 0; i < collection.length; i++) {
           System.out.println(collection[i]);
       }
   }
}

//now the collection length is increased
// ad all the CDs are there
//thank you