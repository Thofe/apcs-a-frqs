
/**
 * Write a description of class TestResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;


public class TestResults
{
    // instance variables - replace the example below with your own
    private ArrayList<StudentAnswerSheet> sheets;
    
    /**
     * Constructs the TestResults class
     */
    public TestResults(ArrayList<StudentAnswerSheet> sheets){
        this.sheets = sheets;
    }
    
    /**
     * Returns the student with the highest score
     * 
     * @param key the key to score all the students by
     * @return the student with the highest score
     */
    public String highestScoringStudent(ArrayList<String> key){
        double highscore = sheets.get(0).getScore(key);
        String highscorer = sheets.get(0).getName();
        
        for (StudentAnswerSheet s: sheets){
            double score = s.getScore(key);
            if (score > highscore){
                highscore =score;
                highscorer = s.getName();
            }
        }
        
        return highscorer;
    }
}
