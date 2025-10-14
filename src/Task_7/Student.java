package Task_7;

public class Student {
    /**
     * Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
     * * faculty (факультет, тип String ), course(тип int) ,
     * Группа(тип String), средняя оценка (тип int).
     * * Инициализацию студента в классе main выполнять через конструктор с параметрами.
     * Также определите конструктор без параметров.
     * 2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
     * 3. Создать метод, который будет изменять текущую группу студента
     * (сам метод в качестве параметра будет принимать новую группу)
     * 4. Создать метод, который будет возвращать текущую группу с
     * тудента.
     * 5. Создать метод, который будет изменять оценку студента и группу
     * студента.
     */

    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int avgMark;

    public Student() {
//конструктор без параметров
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.faculty = "";
        this.course = 1;
        this.group = "";
        this.avgMark = 5;


    }

    public Student(int id, String name, String surname, String faculty, int course, String group,

                   int avgMark) {
//конструктор с параметрами
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.avgMark = avgMark;


    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.print("Id = " + id + "\n" + "name = " + name + "\n" + "surname = " + surname + "\n" + "faculty = " + faculty + "\n" + "course = " + course + "\n" + "group = " + group + "\n" + "avgMark = " + avgMark + "\n");
    }

    public void chgGroup(String group) {
        //* 3. Создать метод, который будет изменять текущую группу студента
        //     * (сам метод в качестве параметра будет принимать новую группу)
        this.group = group;
    }

    public String getGroup() {
        //4. Создать метод, который будет возвращать текущую группу студента

        return this.group = group;
    }

    public void chgMarknGroup(int avgMark, String group) {
        this.avgMark = avgMark;
        this.group = group;
    }
}

