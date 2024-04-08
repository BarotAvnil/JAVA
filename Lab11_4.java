import java.io.*;

public class Lab11_4 {

    public static void main(String[] args) {
        String filename = "xyz.dat";// extension must be .dat for Data input/output stream
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeUTF("A");
            dos.writeInt(20);
            dos.writeUTF("B");
            dos.writeInt(22);
            dos.writeUTF("C");
            dos.writeInt(23);
            System.out.println("Data Written Successfully");
            dos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int marks = dis.readInt();
                Student student = new Student(name, marks);
                System.out.println(student);
            }
            dis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Name : " + name + " , Marks : " + marks;
    }
}