import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String line;
        REGULAR rd = new REGULAR();
        while ((line = br.readLine()) != null) {
            if (rd.isOkey(line)) {
                out.println(line + " - YES");
            } else {
                out.println(line + " - NO");
            }
        }
        out.flush();
    }
}