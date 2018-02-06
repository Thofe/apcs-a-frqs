
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Tester
{
    public static void main()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cat");
        list.add("mouse");
        list.add("frog");
        list.add("dog");
        list.add("dog");
        
        WordList animals = new WordList(list);
        
        System.out.println("Part A");
        System.out.println();
        
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("Part B");
        System.out.println();
        
        animals.removeWordsOfLength(4);
        animals.printList();
        
        animals.removeWordsOfLength(3);
        animals.printList();
        
        animals.removeWordsOfLength(2);
        animals.printList();
    }
}
