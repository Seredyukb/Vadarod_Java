package Task_11;

public class RobotMineSweeper implements RobotEngeneer {
    //    РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
    private String model = "";
    private int powerConsumption;
    private String deminingTool = "";
    private String material = "";
    private boolean isOn;

    public RobotMineSweeper(String model, int powerConsumption, String deminingTool, String material, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.deminingTool = deminingTool;
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

    public String getDeminingTool() {
        return deminingTool;
    }

    public void setDeminingTool(String deminingTool) {
        this.deminingTool = deminingTool;
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
        System.out.println("Робот-минёр включен");

    }

    @Override
    public void turnOffRobot() {
        isOn = false;
        System.out.println("Робот-минёр выключен");

    }

    @Override
    public void showUniquePossibility() {
        System.out.println("Я робот-минёр! Я не умею минировать/разминировать. Я только играю в сапёра :)");
    }

    @Override
    public void repairRobot() {
        System.out.println("Робот-сапёр отремонтирован");
    }

    @Override
    public void createItem() {
        System.out.println("Робот-сапёр создаёт приспособление для разминирования");
    }
}
