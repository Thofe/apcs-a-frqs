
/**
 * Write a description of class Phrase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phrase
{
    // instance variables - replace the example below with your own
    private String currentPhrase;

    /**
     * Constructor for objects of class Phrase
     */
    public Phrase(String p)
    {
        this.currentPhrase = p;
    }
    
    /**
     * Returns the index of the nth occurence of str in the current phrase
     * 
     * @param str the string that will be searched
     * @param n the nth occurence that will be found
     * @return -1 if the nth occurence does not exist, otherwise returns the nth occurence
     */
    public int findNthOccurrence(String str, int n){
        int index = currentPhrase.indexOf(str);
        
        if (index == -1){
            return -1;
        }
        
        for (int i=1; i<n; i++){
            index = currentPhrase.indexOf(str, index+1);
            if (index == -1){
                return -1;
            }
        }
        
        return index;
    }
    
    /**
     * Modifies the current phrase by replacing the nth occurence of str with repl
     * 
     * @param str the segment to be replaced
     * @param n the nth occurence to be replaced
     * @param repl the segment to replace str with
     */
    public void replaceNthOccurrence(String str, int n, String repl){
        int index = findNthOccurrence(str, n);
        
        if (index == -1){
            currentPhrase = currentPhrase;
        }else{
            String pstart = currentPhrase.substring(0, index);
            String pend = currentPhrase.substring(index + str.length());
            
            currentPhrase = pstart + repl + pend;
        }
    }
    
    /**
     * Returns the index of the last occurence of str in the current phrase
     * 
     * @param str the string that is looked for
     * @return the index of the last occurence, -1 will be returned if str is not present
     */
    public int findLastOccurrence(String str){
        int count = 0;
        Phrase temp = new Phrase(currentPhrase);
        
        while (temp.findNthOccurrence(str, 1) != -1){
            count++;
            temp.replaceNthOccurrence(str,1, "");
        }
        
        if (count == 0){
            return -1;
        }else{
            return findNthOccurrence(str, count);
        }
    }
    
    /**
     * Returns a string of the currentPhrase
     * 
     * @return a string of the currentPhrase
     */
    public String makeString(){
        return currentPhrase.toString();
    }
}
