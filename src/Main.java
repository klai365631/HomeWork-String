public class Main {
    public static void main(String[] args) {
//        Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName+' ' + firstName+' ' + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
//        Задача 2
        fullName = fullName.toUpperCase();
        System.out.println("fullName = " + fullName);
//        Задача 3
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("fullName = " + fullName);


    }
}