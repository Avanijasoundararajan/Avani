import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        String line;
        Scanner sc = new Scanner(System.in);
        String inputFile = sc.nextLine();
        String outputFile = sc.nextLine();
        FileReader infile = new FileReader(inputFile);
        BufferedReader inbr = new BufferedReader(infile);
        FileWriter outfile = new FileWriter(outputFile);
        BufferedWriter outbr = new BufferedWriter(outfile);
        HashMap<String,Integer> map = new HashMap<>();
        while((line = inbr.readLine()) != null) {
            String string[] = line.split(" ");
            for(String s : string){
                if(map.containsKey(s)){
                    Integer val = map.get(s);
                    map.put(s,++val);
                }
                else
                {
                    map.put(s,1);
                }
            }
        }
        try {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String s = it.next();
                String str = s.concat(" ").concat(String.valueOf(map.get(s)));
                outbr.write(str);
                outbr.newLine();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            outbr.close();
            outfile.close();
            inbr.close();
            infile.close();
        }

    }
}