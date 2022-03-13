package lesson_3;

public class CreateEmployee {

    public static void main(String[] args) {

        Employee[] arrayEmployee = new Employee[5];

        arrayEmployee[0] = new Employee("Петров Антон Антоныч", "Бухгалтер", "test1@test.ru", "+3751111111", 100, 21);
        arrayEmployee[1] = new Employee("Антонов Петр Петрович", "Сторитель", "test2@test.ru", "+3752222222", 100, 41);
        arrayEmployee[2] = new Employee("Сидоров Иван Иваныч", "Конспиратор", "test3@test.ru", "+3753333333", 100, 22);
        arrayEmployee[3] = new Employee("Федоров Иван Денисович", "Оператор", "test4@test.ru", "+3754444444", 100, 42);
        arrayEmployee[4] = new Employee("Наруто Узумаки из деревни скрытой в листве", "Ниндзя", "test5@test.ru", "+3755555555", 100, 154);

        for (Employee employee : arrayEmployee) {
            if (employee.age > 40) {
                employee.employeeInfo();
            }
        }
    }
}