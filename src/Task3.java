public class Task3 {
    public static void main(String[] args) {
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace('ё', 'е'));
    }
}
