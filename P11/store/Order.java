package store;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Objects;


public class Order implements Saveable{
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

    public Order(BufferedReader br) throws IOException {
        this.orderNumber = Long.parseLong(br.readLine());
        if(nextOrderNumber <= orderNumber)
            nextOrderNumber = orderNumber + 1;
        this.customer = new Customer(br);
        int numOptions = Integer.parseInt(br.readLine());
        while(numOptions-- > 0)
            computers.add(new Computer(br));
    }

    @Override
    public void save(BufferedWriter bw) throws IOException {
        bw.write(Long.toString(orderNumber) + '\n');
        this.customer.save(bw);
        bw.write("" + computers.size() + '\n');
        for(Computer computer : computers)
            computer.save(bw);
    }

    public double cost() {
        double totalCost = 0;
        for (Computer computer : computers) {
            totalCost += computer.cost();
        }
        return totalCost;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ").append(orderNumber).append(" for ").append(customer.toString()).append("\n");
        for (Computer computer : computers) {
            sb.append("   ").append(computer.toString()).append("\n");
        }
        sb.append("Total cost: $").append(String.format("%.2f", cost()/100.0));
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

    @Override
    public int hashCode() {
        return Objects.hash(customer, computers);
    }
}
