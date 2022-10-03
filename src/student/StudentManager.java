package student;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManager {
    ArrayList arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Classs> classses = new ArrayList<>();

    public Student createStudent() {
        System.out.println("Enter name student");
        String name = scanner.nextLine();
        System.out.println("Enter gender student");
        String gender = scanner.nextLine();
        System.out.println("Enter age student");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone student");
        String phone = scanner.nextLine();
        Date data = null;
        while (true) {
            System.out.println("Enter birthday student in the format dd/MM/yyyy");
            String birthday = scanner.nextLine();
            try {
                data = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
                break;
            } catch (ParseException e) {
                System.out.println("wrong format");
                continue;
            }
        }
        for (int i = 0; i < classses.size(); i++) {
            System.out.println(i + 1 + " : " + classses.get(i).getName());
        }
            int choice = Integer.parseInt(scanner.nextLine());
            Classs classs = classses.get(choice - 1);

            Student student = new Student(name, gender, age, phone, date, classs);
            return student;

    }


    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.createStudent().toString());
    }
}