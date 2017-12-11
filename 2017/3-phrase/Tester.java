
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        Phrase phrase1 = new Phrase("A cat ate late.");
        phrase1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(phrase1.makeString());
        
        Phrase phrase2 = new Phrase("A cat ate late.");
        phrase2.replaceNthOccurrence("at", 6, "xx");
        System.out.println(phrase2.makeString());
        
        Phrase phrase3 = new Phrase("A cat ate late.");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        System.out.println(phrase3.makeString());
        
        Phrase phrase4 = new Phrase("aaaa");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        System.out.println(phrase4.makeString());
        
        Phrase phrase5 = new Phrase("aaaa");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        System.out.println(phrase5.makeString());
        
        Phrase phrase6 = new Phrase("A cat ate late.");
        System.out.println(phrase6.findLastOccurrence("at"));
        System.out.println(phrase6.findLastOccurrence("cat"));
        System.out.println(phrase6.findLastOccurrence("bat"));
    }
}
