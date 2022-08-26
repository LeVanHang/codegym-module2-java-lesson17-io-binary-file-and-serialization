package read_write;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Phong chó", "Hà Nội"));
        students.add(new Student(2, "Con Chó họ Đức", "Hà Nội"));
        students.add(new Student(3, "Hân hit", "Đà Nẵng"));
        students.add(new Student(4, "Bảnh", "Hà Nội"));
        students.add(new Student(5, "Hiền Lương", "Hà Nội"));
        writeToFile("C:\\CodeGym\\module2\\b17-io-binary-file-and-serialization\\src\\read_write\\student.txt", students);


        List<Student> studentDataFromFile = readDataFromFile("C:\\CodeGym\\module2\\b17-io-binary-file-and-serialization\\src\\read_write\\student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}