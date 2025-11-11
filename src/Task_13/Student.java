package Task_13;

public class Student {
    //    имя, фамилия, дата рождения, город рождения, средний бал.
    private String name;
    private String surname;
    private String dateOfBirth;
    private String city;
    private Integer avgMark;

    public Student(String name, String surname, String dateOfBirth, String city, Integer avgMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(Integer avgMark) {
        this.avgMark = avgMark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", city='" + city + '\'' +
                ", avgMark=" + avgMark +
                '}';
    }
}
