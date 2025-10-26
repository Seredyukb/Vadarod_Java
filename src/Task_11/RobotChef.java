package Task_11;

public class RobotChef implements Robot {
    private String model = "";
    private int powerConsumption;
    private String countryOrigin = "";
    private String cookingUnit = "";
    private boolean isOn;

    public RobotChef(String model, int powerConsumption, String countryOrigin, String cookingUnit, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOrigin = countryOrigin;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getCookingUnit() {
        return cookingUnit;
    }

    public void setCookingUnit(String cookingUnit) {
        this.cookingUnit = cookingUnit;
    }

    public boolean isOn() {
        return isOn;
    }

    //    РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
    @Override
    public void turnOnRobot() {
        isOn = true;
        System.out.println("Робот-повар включен");

    }

    @Override
    public void turnOffRobot() {
        isOn = false;
        System.out.println("Робот-повар выключен");
    }

    @Override
    public void showUniquePossibility() {
        System.out.println("Я робот-повар и я очень умён!\nЯ искуссно умею готовить блюда белорусской кухни, а именно:\nдраники!\nДраники!\nДРАНИКИ АААА!");
    }
}
