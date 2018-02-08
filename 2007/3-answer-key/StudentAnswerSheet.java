
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class StudentAnswerSheet
{
    // instance variables - replace the example below with your own
    private ArrayList<String> answers;

    /**
     * Constructor for objects of class StudentAnswerSheet
     */
    public StudentAnswerSheet(ArrayList<String> answers)
    {
        this.answers = answers;
    }
    
    /**
     * Gets the score of a student based on a given key
     * 
     * @param key the key that will be used to score the test
     * @return the score of the student
     */
    public double getScore (ArrayList<String> key){
        int correct =0;
        int incorrect = 0;
        
        for (int i = 0; i<key.size(); i++){
            if (key.get(i).equals(answers.get(i))){
                correct++;
            }
            else if (!answers.get(i).equals("?")){
                incorrect ++;
            }
        }
        
        return (correct -(0.25 * incorrect));
    }
    
    /**
     * returns the name of the student for a given key
     * 
     * @return the name of the student
     */
    public String getName(){
        return answers.get(answers.size() -1);
    }
}
