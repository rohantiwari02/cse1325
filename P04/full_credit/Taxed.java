class Taxed extends Product {
    static double salesTaxRate = 0.0825;

    public Taxed(String name, double cost) {
        super(name, cost);
    }

    public static void setTaxRate(double rate) {
        salesTaxRate = rate;
    }

    @Override
    public double price() {
        return super.cost * (1 + salesTaxRate);
    }
    }
