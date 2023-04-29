package store;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Objects;

public class Computer implements Saveable {
    private String name;
    private String model;
    private ArrayList<Option> options = new ArrayList<>();

    public Computer(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public long cost() {
        long cost = 0;
        for (Option option : options) {
            cost += option.cost();
        }
        return cost;
    }

    public Computer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.model = br.readLine();
        int numOptions = Integer.parseInt(br.readLine());
        while(numOptions-- > 0)
            options.add(new Option(br));
    }
    
    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + "\n");
        bw.write(model + "\n");
        bw.write("" + options.size() + '\n');
        for (Option option : options) {
            option.save(bw);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (").append(model).append(")\n");
        for (Option option : options) {
            sb.append("  ").append(option.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Computer)) {
            return false;
        }
        Computer c = (Computer) o;
        return this.toString().equals(c.toString());
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, model, options);
    }
}
