
package TestFiles;

import UtilFiles.Catagory;
import UtilFiles.InsertIntoCatagory;

public class TestCatagoryInsert {
    public static void main(String[] args) {
        Catagory c = new Catagory();
        
        //c.setName("Mobile");
        //c.setName("MotorBike");
        c.setName("TV");
        InsertIntoCatagory.insert(c);
    }
}
