package Task_13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Integer groupNo;

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students;

    public Group(Integer groupNo) {
        this.groupNo = groupNo;
        this.students = new ArrayList<>();
    }

    public Integer getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setMinskStudents(Student s) {
        if (s.getCity() == "Minsk") {
            students.add(s);

        }

    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNo=" + groupNo +
                ", students=" + students +
                '}';
    }

    public void setNonMinskStudents(Student s) {
        if (s.getCity() != "Minsk") {
            students.add(s);

        }
    }

    //        1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);
   /* public void removeStudentsByMark(int mark) {
        List<Student> newList = new ArrayList<>();
        for (Student s : students) {
            if (s.getAvgMark() > mark) {
                newList.add(s);
            }
            students = newList;
        }
    }*/
    public void removeStudentsByMark(int mark) {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).getAvgMark() < mark) {
                students.remove(i);
            }
        }
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
            System.out.println("Перевод завершен. В группе " + groupNo + " осталось: " + students.size() + " студентов");
        } else {
            System.out.println("В группе " + groupNo + " достаточно студентов (" + students.size() + "). Перевод не требуется.");

        }
    }

//     1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

    public int getAvgMark() {
        int sum = 0;
        for (Student s : students) {
            sum += s.getAvgMark();
        }
        return sum / students.size();
    }
}



