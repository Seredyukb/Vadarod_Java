package Task_12;

public class Vehicle {
    private int emissionQuantity;
    private String name;

    public int getEmissionQuantity() {
        return emissionQuantity;
    }

    public void setEmissionQuantity(int emissionQuantity) {
        this.emissionQuantity = emissionQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(int emissionQuantity, String name) {
        this.emissionQuantity = emissionQuantity;
        this.name = name;
    }


}
