import java.io.*;

public class Lab11_2 {

    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);
        if (file.isFile()) {
            System.out.println("File Size: " + file.length());
        } else if (file.isDirectory()) {
            System.out.println("Listing files in directory" + file.getAbsolutePath());
            File files[] = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                File f = files[i];
                System.out.println(f.getName() + "Size" + (f.isFile() == true ? f.length() : "DIR"));
            }
        } else {
            System.out.println("File or Directory not exist");
        }
    }
}
