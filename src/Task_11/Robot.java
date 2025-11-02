package Task_11;

public interface Robot {
    //1. Создать интерфейс Робот. В нём определены методы: Дефолтный метод:  Отремонтировать робота и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
    default void repairRobot(){
        System.out.println("Робот отремонтирован");
    };

    void turnOnRobot();

    void turnOffRobot();

    void showUniquePossibility();

}
