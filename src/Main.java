import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static int countOneWord (String input, String word) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 1).equals(word)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = urlToString("http://erdani.com/tdpl/hamlet.txt");
    }
}
