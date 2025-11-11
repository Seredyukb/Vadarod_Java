package Task_14;

public class Main {
    //1.4 Создать пациентов. Распределить их по палатам.
    // В одной палате по 3 пациента максимум. При этом попробуйте добавит двух пациентов, с одинаковыми полями.

    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Иван", "Иванов", "Ковид", 35, Gender.MALE);
        Patient p2 = new Patient(2, "Михаил", "Михайлов", "Ковид", 37, Gender.MALE);
        Patient p3 = new Patient(32, "Петр", "Петров", "Ковид", 38, Gender.MALE);
        Patient p4 = new Patient(4, "Иванна", "Иванова", "Пневмония", 45, Gender.FEMALE);
        Patient p5 = new Patient(5, "Михаила", "Михайлова", "Пневмония", 38, Gender.FEMALE);
        Patient p6 = new Patient(32, "Михаил", "Михайлов", "Ковид", 37, Gender.MALE);

        Room maleRoom = new Room(701, RoomType.MALE);
        Room femaleRoom = new Room(702, RoomType.FEMALE);

        maleRoom.addPatient(p1);
        maleRoom.addPatient(p2);
        maleRoom.addPatient(p3);
        maleRoom.addPatient(p6);


        femaleRoom.addPatient(p4);
        femaleRoom.addPatient(p5);
        // femaleRoom.addPatient(p6);

        Department dep = new Department("Терапевтическое отделение");
        dep.addRoom(maleRoom);
        dep.addRoom(femaleRoom);

        maleRoom.printPatients();
        femaleRoom.printPatients();

        System.out.println("Количество мужчин в отделении: " + dep.countGender(Gender.MALE));
        System.out.println("Количество женщин в отделении: " + dep.countGender(Gender.FEMALE));


    }
}
