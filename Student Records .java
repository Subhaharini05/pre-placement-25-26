import java.io.*;
public class StudentFile {
    public static void main(String[] args) throws Exception {
        BufferedWriter w = new BufferedWriter(new FileWriter("students.txt"));
        w.write("101,Ravi,85\n102,Asha,90");
        w.close();
        BufferedReader r = new BufferedReader(new FileReader("students.txt"));
        String line;
        while((line = r.readLine()) != null) {
            String[] s = line.split(",");
            System.out.println("ID: " + s[0] + ", Name: " + s[1] + ", Marks: " + s[2]);
        }
        r.close();
    }
}
