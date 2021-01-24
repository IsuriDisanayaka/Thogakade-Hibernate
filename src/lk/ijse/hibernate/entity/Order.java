//package lk.ijse.hibernate.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Order implements SuperEntity{
//   @Id
//    private String OrderId;
//    private String Date;
//    @ManyToOne
//    private Customer customer;
//
//    public Order() {
//    }
//
//    public Order(String orderId, String date, Customer customer) {
//        OrderId = orderId;
//        Date = date;
//        this.customer = customer;
//    }
//
//    public String getOrderId() {
//        return OrderId;
//    }
//
//    public void setOrderId(String orderId) {
//        OrderId = orderId;
//    }
//
//    public String getDate() {
//        return Date;
//    }
//
//    public void setDate(String date) {
//        Date = date;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "OrderId='" + OrderId + '\'' +
//                ", Date='" + Date + '\'' +
//                ", customer=" + customer +
//                '}';
//    }
//}
