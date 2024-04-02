package StudentManagementSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * FileReadWrite
 */
public class FileReadWrite {

    public static void fileWrite(String p, String d){
        try{
            String path = p;
            String data = d;
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(data);
            bw.newLine();
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String p){
        String path = p;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}