package Task_13;

public class Main {
    public static void main(String[] args) {
//        Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.
//        1.1. Создать несколько студентов.
//        1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
//        1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
//        1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);
//        1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
//        1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
//        1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
//        1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)
//        1.9*. Вывести студентов в порядке возрастания среднего бала
//        1.10*. Вывести студентов в порядке убывания среднего бала.0
        Student vasiliy = new Student("Vasiliy", "Komlik", "22.04.1993", "St. Petersburg", 9);
        Student bogdan = new Student("Bogdan", "Seredyuk", "22.04.1991", "Minsk", 8);
        Student kirill = new Student("kirill", "Kazimirov", "12.04.1993", "Minsk", 10);
        Student hleb = new Student("Hleb", "Khalimanovich", "22.04.1990", "Moscow", 7);
        Student vanya = new Student("Ivan", "Kovalyov", "22.04.2003", "Minsk", 10);

        Group group1 = new Group(1);
        Group group2 = new Group(2);
        group1.setNonMinskStudents(vasiliy);
        group1.setNonMinskStudents(hleb);
        group2.setMinskStudents(bogdan);
        group2.setMinskStudents(kirill);
        group2.setMinskStudents(vanya);
        System.out.println(group1.toString());
        System.out.println(group2.toString());
        Faculty faculty1 = new Faculty("Programming Faculty");
        faculty1.setGroups(group1);
        faculty1.setGroups(group2);
        System.out.println(faculty1.toString());
        System.out.println("group1 до удаления: " + group1.toString());
        // group1.removeStudentsByMark(8);
        System.out.println("group1 после удаления: " + group1.toString());

        System.out.println(group1.getStudents());
        System.out.println(group1.getAvgMark());
        faculty1.setStatus(FacultyStatus.ACTIVE);
        System.out.println(faculty1.getStatus().getFacultyStatus());
    }
}
