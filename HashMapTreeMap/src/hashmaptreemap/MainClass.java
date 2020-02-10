/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaptreemap;
import java.util.*;
import java.util.Iterator;
/**
 *
 * @author User
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
      //Adding elements to HashMap
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");
      
      //Adding elements to TreeMap
      tmap.put(1, "Data1");
      tmap.put(23, "Data2");
      tmap.put(70, "Data3");
      tmap.put(4, "Data4");
      tmap.put(2, "Data5");

      // Display content using Iterator
      Set set_hash = hmap.entrySet();
      Iterator iterator_hash = set_hash.iterator();
      while(iterator_hash.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator_hash.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

      // Get values based on key
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);

      // Remove values based on key
      hmap.remove(3);
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
       }
      // Display content for tree using Iterator
      Set set_tree = tmap.entrySet();
      Iterator iterator_tree = set_tree.iterator();
      while(iterator_tree.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator_tree.next();
         System.out.print("Tkey is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

   }
}
