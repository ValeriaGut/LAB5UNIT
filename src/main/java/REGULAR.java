
import java.io.*;
import java.util.regex.Pattern;

public class REGULAR {
    public boolean isOkey(String line) throws IOException {
        if (Pattern.matches("^[{(]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[)}]?$", line)) {
            return true;
        } else {
            return false;
        }
    }
}