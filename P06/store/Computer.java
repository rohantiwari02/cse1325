package store;

import java.util.ArrayList;

public class Computer {
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
}
