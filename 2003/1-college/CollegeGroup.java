
/**
 * Write a description of class CollegeGroup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeGroup
{
    private College[] myColleges;
    
    /**
     * Constructs the myColleges array
     * 
     * @param myCollges (as an array of College) the set of colleges to be used
     */
    public CollegeGroup(College[] myColleges){
        this.myColleges = myColleges;
    }
    
    /**
     * Updates the tuition
     * 
     * @param collegeName (as a String) the name of the college
     * @param newTuition (as an int) the new tuition
     */
    public void updateTuition(String collegeName, int newTuition){
        for (int i = 0; i<myColleges.length; i++){
            if (myColleges[i].getName().equals(collegeName)){
                myColleges[i].setTuition(newTuition);
            }
        }
    }
    
    /**
     * Returns the array of colleges in a given region where low<= tuition <= high.
     * @return the number of colleges that meet the criteria
     */
    public College[] getCollegeList(String region, int low, int high){
        int count = 0;
        
        for(int i = 0; i < myColleges.length; i++){
            if(myColleges[i].getRegion().equals(region)){
                if (myColleges[i].getTuition() >= low && myColleges[i].getTuition()<=high){
                    count++;
                }
            }
        }
        
        College[] temparray = new College[count];
        int count2 = 0;
     
        for (int z=0; z<myColleges.length; z++){
            if (myColleges[z].getRegion().equals(region)){
                if (myColleges[z].getTuition() >= low && myColleges[z].getTuition()<=high){
                    temparray[count2] = myColleges[z];
                    count2++;
                }
            }
        }
        
        return temparray;
    }
}