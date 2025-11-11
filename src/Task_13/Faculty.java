package Task_13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    //    наименование факультета, список групп (List<Group> groups. )
    private String faculty;
    private List<Group> groups;
    private FacultyStatus status;

    public FacultyStatus getStatus() {
        return status;
    }

    public void setStatus(FacultyStatus status) {
        this.status = status;
    }

    public Faculty(String faculty) {
        this.faculty = faculty;
        this.groups = new ArrayList<>();
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(Group g) {
        groups.add(g);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty='" + faculty + '\'' +
                ", groups=" + groups +
                '}';
    }
}
