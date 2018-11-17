
package UtilFiles;
public class Catagory {
    private int c_id;
    private String name;

    public Catagory() {
    }

    public Catagory(int c_id, String name) {
        this.c_id = c_id;
        this.name = name;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
