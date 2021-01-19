package debug;

public class GradData {
    private int gradID;
    private String gradName;
    private int gradAge;
    GradData() //created constructor
    {
        gradID = 100;
        gradName = "Harun";
        gradAge = 18;
    }
//    GradData()    //here is the problem we can't use same types two constructor. if we want to overload constructor then parameter have to be different.other wise its would be wrong
//    {
//        gradID = 101;
//        gradName = "Osman";
//        gradAge = 19;
//    }
    GradData(int num1, String str, int num2) //constructor overloading
    {
        gradID = num1;
        gradName = str;
        gradAge = num2;
    }
    //below uses getter and setter methode for access private variable.
    public int getgradID() {
        return gradID;
    }
    public void setgradID(int gradID) {
        this.gradID = gradID;
    }
    public String getgradName() {
        return gradName;
    }
    public void setgradName(String gradName) {
        this.gradName = gradName;
    }
    public int getgradAge() {
        return gradAge;
    }
    public void setgradAge(int gradAge) {
        this.gradAge = gradAge;
    }

}
