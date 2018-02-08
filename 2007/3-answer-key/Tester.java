
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Tester
{
    public static void main(){
        ArrayList<String> student1 = new ArrayList<String>();
        student1.add("a");
        student1.add("a");
        student1.add("a");
        student1.add("a");
        student1.add("a");
        student1.add("a");
        student1.add("a");
        student1.add("a");
        student1.add("Student 1");
        
        ArrayList<String> student2 = new ArrayList<String>();
        student2.add("b");
        student2.add("a");
        student2.add("b");
        student2.add("a");
        student2.add("b");
        student2.add("a");
        student2.add("b");
        student2.add("a");
        student2.add("Student 2");
        
        ArrayList<String> student3 = new ArrayList<String>();
        student3.add("b");
        student3.add("b");
        student3.add("b");
        student3.add("b");
        student3.add("b");
        student3.add("b");
        student3.add("b");
        student3.add("b");
        student3.add("Student 3");
        
        ArrayList<String> key = new ArrayList<String>();
        key.add("a");
        key.add("a");
        key.add("a");
        key.add("a");
        key.add("a");
        key.add("a");
        key.add("a");
        key.add("a");
        
        StudentAnswerSheet student1A = new StudentAnswerSheet(student1);
        StudentAnswerSheet student2A = new StudentAnswerSheet(student2);
        StudentAnswerSheet student3A = new StudentAnswerSheet(student3);
        
        System.out.println(student1A.getName() + ":" + student1A.getScore(key));
        System.out.println(student2A.getName() + ":" + student2A.getScore(key));
        System.out.println(student3A.getName() + ":" + student3A.getScore(key));
        
        ArrayList<StudentAnswerSheet> classSheets = new ArrayList<StudentAnswerSheet>();
        classSheets.add(student1A);
        classSheets.add(student2A);
        classSheets.add(student3A);
        
        TestResults classResults = new TestResults(classSheets);
        
        System.out.println(classResults.highestScoringStudent(key) + " scored the highest in the class");
    }
}
