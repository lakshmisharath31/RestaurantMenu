package Restaurant;

import javax.xml.crypto.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Menu {
    static MenuItem mi = new MenuItem();

    public Menu (){
        lItems();
    }


    public void menuList(String MenuItem, String Cato, Double Price) {
        mi.setMenuItems(MenuItem);
        mi.setCato(Cato);
        mi.setDescription("Menu's are rich in protiens and Carb");
        mi.setPrice(Price);
        display();

    }
    public void lItems(){
        System.out.println("------------------------------------------");
        System.out.println("Welcome Lakshmi's Kitchen");
        System.out.println("------------------------------------------");
    }
    public void display(){
        System.out.println(mi.getMenuItems() + " :  " + "$" + mi.getPrice());
        System.out.println("(Category:" + mi.getCato() + ")");
        System.out.println("(Description:" + mi.getDescription() + ")");
    }
    public void myDate(){
        mi.setUpdatedDate(new Date());
        System.out.println("------------------------------------------");
        System.out.println("Last updated:" + mi.getUpdatedDate());
        System.out.println("------------------------------------------");
    }


}

