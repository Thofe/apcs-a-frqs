
/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class College
{
    private String name= "";
    private String region= "";
    private int tuition= 0;
    
    /**
     * Constructs a college
     * 
     * @param name (as a String) the name of the college
     * @param region (as a String) the region of the college
     * @param tuition (as an int) the tuition of the college
     */
    public College(String name, String region, int tuition){
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    
    /**
     * @return the name of the college
     */
    public String getName()
    {
       return name;
    }

    /**
     * @return region of this college
     */
    public String getRegion()
    {
       return region;
    }

    /**
     * @return tuition of this college
     */
    public int getTuition()
    {
       return tuition;
    }

    /**
     * set tuition for this college to newTuition
     * 
     * @param newTuition (as an int) the new tuition of a college
     */
    public void setTuition(int newTuition)
    {
       this.tuition = newTuition;
    }
}
