package Task_13;

public enum FacultyStatus {
    ACTIVE("Активный"),

    NOT_ACTIVE("Неактивный факультет");

    private String facultyStatus;

    FacultyStatus(String facultyStatus) {
        this.facultyStatus = facultyStatus;
    }

    public String getFacultyStatus() {
        return facultyStatus;
    }
}
