package TestFiles;

import UtilFiles.Catagory;
import UtilFiles.InsertIntoProduct;
import UtilFiles.Product;
import java.util.Date;

public class TestProductInsert {

    public static void main(String[] args) {
        Product p = new Product();
        p.setP_name("Nokia 1110");
        p.setP_quantity(20);
        p.setP_unitPrice(1200);
        p.setP_totalPrice(24000);
        p.setP_purchaseDate(new Date());
        Catagory c = new Catagory();
        c.setC_id(1);
        p.setCatragory(c);
        
        InsertIntoProduct.insert(p);
    }
}
