package Restaurant;

import com.sun.source.tree.NewArrayTree;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class RestaurantRunner {



    public static void main(String[] args){
        Menu menu = new Menu();
        String [] category = {"BreakFast","Lunch","Dinner"};
       // RestaurantRunner rr = new RestaurantRunner();
        menu.menuList("Masala Dosa",category[0],12.00);
        menu.menuList("Masala Dosa",category[0],12.00);
        menu.menuList("Upma",category[0],8.00);
        menu.menuList("Thali",category[1],15.00);
        menu.menuList("Poori",category[2],7.00);

        menu.myDate();
}
}
