/*
 Program has to get frequency of numbers
 */
package kata2;

import java.util.HashMap;

/**
 *
 * @author Krystian Kurzawa
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numbers[] = {2,4,7,9,6,2,3,15,6,4,12,6,3,2,7};
        // int i;
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int number : numbers){
            if(freq.containsKey(number)){
                freq.put(number, freq.get(number)+1);
            }
            else{
                freq.put(number, 1);
            }
        }
        
        for(int key : freq.keySet()){
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}