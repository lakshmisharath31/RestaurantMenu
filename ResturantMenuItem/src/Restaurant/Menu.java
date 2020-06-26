package Restaurant;

import javax.xml.crypto.Data;
import java.util.Locale;

public class Menu {

    public static void main(String[] args){
        MenuItem menu = new MenuItem();
        menu.setMenuItems("Dosa");
        menu.setCato("Breakfast");
        //System.out.println(menu.getMenuItems());
        menu.setDescription("Basically has Rice and lentils");
        java.util.Date date=new java.util.Date();
        menu.setUpdatedDate(date);

        menu.setPrice(12.50);
        System.out.println("------------------------------------------");
        System.out.println("Welcome Lakshmi's Kitchen");
        System.out.println("------------------------------------------");
        System.out.println(menu.getMenuItems() +" :  "+"$" +menu.getPrice());
        System.out.println("(Category:"+menu.getCato()+")");
        System.out.println("(Description:"+menu.getDescription()+")");
        System.out.println("------------------------------------------");
        System.out.println("Last updated:"+menu.getUpdatedDate());
    }
}
