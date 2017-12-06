
/**
 * Write a description of class HiddenWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HiddenWord
{
    // instance variables - replace the example below with your own
    private String puzzle;

    /**
     * Constructor for objects of class HiddenWord
     @param puzzle the word to be stored as the word to guess
     */
    public HiddenWord(String puzzle)
    {
        this.puzzle = puzzle;
    }
    
    /**
     * Checks what part of the guess is partially or entirely correct
     * @param guess the guess the user gives
     * @return the correct or partially correct parts of the guess
     */
    public String getHint(String guess){
        String returnable = "";
        
        for (int i = 0; i < puzzle.length(); i ++){
            String guessindex = guess.substring(i, i+1);
            String puzzleindex = puzzle.substring(i, i+1);
            
            if (guessindex.equals(puzzleindex)){
                returnable += puzzleindex;
            }else if (puzzle.indexOf(guessindex) != -1){
                returnable += "+";
            }else{
                returnable += "*";
            }
        }
        
        return returnable; 
    }
}
