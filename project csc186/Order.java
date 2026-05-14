import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

public class Order {

    static int queueCount = 1;

    private int queueNumber;
    List<MenuItem> orderedItem;
    boolean isMember; // to ask member or not
    private String memberId;
    String paymentMethod;
    private LocalDateTime ordertime;

    public Order() {
        this.queueNumber = queueCount++;
        this.orderedItem = new ArrayList<>();
        this.ordertime = LocalDateTime.now();
    }
    public void addItem(MenuItem item){
        orderedItem.add(item);
    }

    // setter and getter
    public int getQueueNumber() { 
        return queueNumber; 
    }
    public void setQueueNumber(int q){
        this.queueNumber=q;
    }
    public String getMemberId(){
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    // to get format date and time
    private String getFormatteddatetime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return ordertime.format(formatter);
    }
    
    public double calcTotal(){
        double total = 0;
        for(MenuItem item: orderedItem){
            total += item.price;
        }
        if (isMember){
            total *= 0.97; // 3% disc for member
        }
        return total;
    }
    
    public void printReceiptCustomer(){
        System.out.println("\n=====================================");
        System.out.printf("%25s\n", "CUSTOMER RECEIPT");
        System.out.println("=====================================");
        System.out.printf("Queue Number: # %04d ",queueNumber);
        System.out.println("\nDate & Time: "+ getFormatteddatetime());
        System.out.println("\nItems: ");
        for(MenuItem item : orderedItem){
            System.out.println("- "+ item);
        }
        System.out.println("\n-------------------------------------");
        System.out.printf("Total: RM%.2f\n", calcTotal());
        System.out.println("Payment Method: "+ paymentMethod);
        System.out.println("Member: " + (isMember ? "Yes" : "No"));
        if (isMember && memberId != null) { // Display member ID if available
            System.out.println("Member ID: " + memberId);
            System.out.println("\n3% Member Discount Applied.");
        }
        System.out.println("Thank you! Please wait for your order.");
        System.out.println("=====================================\n");

    }
    public void printReceiptAdmin(){
        System.out.println("\n=====================================");
        System.out.printf("%25s\n", "ADMIN RECEIPT");
        System.out.println("=====================================");
        System.out.printf("\nQueue Number: # %04d ",queueNumber);
        System.out.println("\nDate & Time: "+ getFormatteddatetime());
        System.out.println("\nItems:");

        for(MenuItem item : orderedItem){
            System.out.println("- "+ item);
        }
        System.out.println("\n-------------------------------------");
        System.out.printf("Total: RM%.2f\n", calcTotal());
        System.out.println("Payment Method: "+ paymentMethod);
        System.out.println("Member: " + (isMember ? "Yes" : "No"));
        System.out.println("Please bring Admin Receipt to the counter.");
        System.out.println("=====================================");
    }
}




