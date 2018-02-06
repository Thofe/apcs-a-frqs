
/**
 * Write a description of class WordList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class WordList
{
    private ArrayList<String> myList;
    
    /**
     * Constructor for objects of class WordList
     */
    public WordList(ArrayList<String> myList)
    {
        this.myList = myList;
    }
    
    /**
     * Counts the number of strings within the myList array list with the length of len
     *
     * @param len the length of word being searched for
     * @return    the ammount of words of length len
     */
    public int numWordsOfLength(int len)
    {
        int count =0;
        
        for (String i: myList){
            if (i.length() == len){
                count ++;
            }
        }
        
        return count;
    }
    
    /**
     * Removes all the string of length len in the myList array list
     * 
     * @param len the length of word being searched for
     */
    public void removeWordsOfLength(int len){
        for (int i =0; i<myList.size(); i++){
            if (myList.get(i).length() == len){
                myList.remove(i);
                i--;
            }
        }
    }  
    /**
     * Prints the array list myList
     */
    public void printList(){
        System.out.println(myList);
    }
}
