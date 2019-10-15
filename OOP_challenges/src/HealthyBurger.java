public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hbPrice = super.itemizeHamburger();

        if(this.healthyExtra1Name != null) {
            hbPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for " + this.healthyExtra1Price);
        }

        if(this.healthyExtra2Name != null) {
            hbPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for " + this.healthyExtra2Price);
        }

        return hbPrice;
    }
}
