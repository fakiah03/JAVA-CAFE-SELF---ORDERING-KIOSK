public abstract class MenuItem {

    private final String menu;
    double price;

    public MenuItem(String menu, double price) {
        this.menu = menu;
        this.price = price;
    }

    public void display(){
        System.out.printf(menu + "              RM%.2f\n",price ); // menu display
    }

    public String toString() {
        return menu + "- RM" +price;
    }
}