package store;

public class Option {
    protected String name;
    protected long cost;

    public Option(String name, long cost) {
        this.name = name;
        if(cost < 0) throw new IllegalArgumentException("Price must be non-negative");
        this.cost = cost;
    }

    public long cost() {
        return cost;
    }
    
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", (double) cost / 100) + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Option))
            return false;
        Option c = (Option) o;
        return (name == c.name) && (cost == c.cost);
    }
}
