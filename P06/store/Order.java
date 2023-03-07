package store;

import java.util.ArrayList;

public class Order {
    private static long nextOrderNumber = 0;
    private long orderNumber;
    private Customer customer;
    private ArrayList<Computer> computers;

    public static long orderNumber() {
        return nextOrderNumber++;
    }

    public Order(Customer customer) {
        this.computers = new ArrayList<>();
        this.customer = customer;
        this.orderNumber = orderNumber();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ").append(orderNumber).append(" for ").append(customer.toString()).append("\n");
        for (Computer computer : computers) {
            sb.append("   ").append(computer.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order other = (Order) obj;
        if (!customer.equals(other.customer)) {
            return false;
        }
        if (computers.size() != other.computers.size()) {
            return false;
        }
        for (int i = 0; i < computers.size(); i++) {
            if (!computers.get(i).equals(other.computers.get(i))) {
                return false;
            }
        }
        return true;
    }
}
