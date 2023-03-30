package Part3.Shopping;

public abstract class Product {

    private final String type;
    private double price, costPrice;

    public Product(String type, int price, int costPrice) {
        this.type = type;
        setPrice(price);
        setCostPrice(costPrice);
        if (price < costPrice) {
            System.out.println("By selling the product by this cost you will lose a money");
        }
    }

    public abstract void guarantee();


    public  double getPrice() {
        return price;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double profit() {
        return price - costPrice;
    }

    public String getType() {
        return type;
    }


    public void setPrice(double price) {
        if (price >= 1000) {
            this.price = price;
        } else {
            System.out.println("All products costs more than 1000");
        }
    }

    public void setCostPrice(double costPrice) {
        if (costPrice >= 700 && costPrice <= price) {
            this.costPrice = costPrice;
        } else {
            System.out.println("The product's cost price must be more than 700");
        }
    }

}
