package model;

public class Pc {
    Integer ref;
    String model;
    Integer quantity;
    Float price;

    // constructor parrameter
    public Pc(Integer ref, String model, Integer quantity, Float price) {
        this.ref = ref;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    // empty constructor
    public Pc(){

    }

    // getters & setters

    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    // toString
    @Override
    public String toString() {
        return "Pc{" +
                "ref=" + ref +
                ", model='" + model + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
