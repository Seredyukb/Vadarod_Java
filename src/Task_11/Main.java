package Task_11;

public class Main {

//            1.1 Создать классы роботов.
//    Дефолтный метод repairRobot() - уже реализован в интерфейсе
//    Абстрактные методы - должны быть реализованы в каждом классе

    //    Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, в классах, которые требует интерфейс.
//    В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
//1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремонтировать робота (результаты выполнения методы выведите в консоль)
//            1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
//1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)
//            1.5 Добавить интерфейс, который будет называться РоботИнженер. Он должен расширить интерфейс Робот. От этого интерфейса должны наследоваться РоботСапёр и РоботСтроитель. В этом интерфейсе определите абстрактный метод createItem (Робот строитель создаёт бетон, РоботСапёр создаёт приспособление для разминирования).
//            1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
//    Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.
    public static void main(String[] args) {
        RobotBuilder robotBuilder1 = new RobotBuilder("agroBuilder", 220, "Belarus", "Tractor", "metal", true);
        RobotMineSweeper robotMineSweeper1 = new RobotMineSweeper("agroMineSweeper", 220, "potatoMines", "shovel", true);
        RobotChef robotChef1 = new RobotChef("agroChef", 220, "Belarus", "Potatoe", true);

        robotBuilder1.repairRobot();
        robotChef1.repairRobot();
        robotMineSweeper1.repairRobot();
        robotChef1.showUniquePossibility();
        robotBuilder1.showUniquePossibility();
        robotMineSweeper1.showUniquePossibility();
        robotBuilder1.createItem();
        robotMineSweeper1.createItem();
        Robot robotsExhibition[] = {robotChef1, robotBuilder1, robotMineSweeper1};
        RobotEngeneer robotEngeneerExhibition[] = {robotBuilder1, robotMineSweeper1};
        RobotMineSweeper robotMineSweeperExhibition[] = {robotMineSweeper1};
        //Реализация навыков на выставке всех роботов.
        System.out.println("Реализация навыков на выставке всех роботов");
        for (Robot s : robotsExhibition) {
            s.showUniquePossibility();
        }
        //Реализация навыков на выставке роботов-инженеров.
        System.out.println("Реализация навыков на выставке роботов-инженеров");
        for (RobotEngeneer s : robotEngeneerExhibition) {
            s.showUniquePossibility();
            s.createItem();
        }
        //Реализация навыков на выставке роботов-минёров.
        System.out.println("Реализация навыков на выставке роботов-минёров");
        for (RobotMineSweeper s : robotMineSweeperExhibition) {
            s.showUniquePossibility();
            s.createItem();
        }
    }
}
