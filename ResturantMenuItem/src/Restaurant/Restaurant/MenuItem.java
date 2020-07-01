package Restaurant;

import java.util.Date;

public class MenuItem {

    private String cato;
    private String description;
    private String menuItems;
    private Double price;
    private Date updatedDate;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getCato() {
        return cato;
    }

    public void setCato(String cato) {
        this.cato = cato;
    }
    public String getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

}
