import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class Main1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputFile = s.nextLine();
        String outputFile = s.nextLine();
        try{
            FileInputStream reader = new FileInputStream(inputFile);
            FileOutputStream writer = new FileOutputStream(outputFile);
            int i=0;
            while((i=reader.read())!=-1){
                System.out.print((char)i);
                writer.write((char)i);
            }
            reader.close();
            System.out.println("File copied");
        }catch(Exception e){System.out.println(e);}
    }
}