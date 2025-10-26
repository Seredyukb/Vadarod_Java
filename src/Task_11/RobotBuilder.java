package Task_11;

public class RobotBuilder implements RobotEngeneer {
    //    РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
    private String model = "";
    private int powerConsumption;
    private String countryOrigin = "";
    private String buildAggregate = "";
    private String material = "";
    boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String countryOrigin, String buildAggregate, String material, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOrigin = countryOrigin;
        this.buildAggregate = buildAggregate;
        this.material = material;
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

    public String getBuildAggregate() {
        return buildAggregate;
    }

    public void setBuildAggregate(String buildAggregate) {
        this.buildAggregate = buildAggregate;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOnRobot() {
        isOn = true;
        System.out.println("Робот-строитель включен");
    }

    @Override
    public void turnOffRobot() {
        isOn = false;
        System.out.println("Робот-строитель выключен");
    }

    @Override
    public void showUniquePossibility() {
        System.out.println("Я робот-строитель и я очень изобретателен!\nЯ умею строить:\nдома из картонных коробок;\nдома из стульев и одеяла;\nдома изграблей, лопат и радюги");

    }

    @Override
    public void createItem() {
        System.out.println("Робот-строитель создаёт бетон");
    }
}
