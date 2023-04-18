package store;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        if (email.indexOf('@') == -1 || email.indexOf('.', email.indexOf('@')) == -1) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public Customer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.email = br.readLine();
    }
    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + '\n');
        bw.write(email + '\n');
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer))
            return false;
        Customer c = (Customer) o;
        return (name == c.name) && (email == c.email);
    }
}
