import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class webS {
    public static void main(String[] args) {
        System.out.println(uniqueCount("My name is Saud, My name is ALrahseed, my name is nizar, my name is Kanye, my name is West"));
    }
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
    public static int wordCount(final String text, final String word) {
        int count = 0;
        String [] x = text.toLowerCase().split(word.toLowerCase());
        count = x.length -1;
        return count;
    }
    public static int uniqueCount(final String text1) {
        int count= 0;
        String [] x = text1.toLowerCase().split(" ");
        String [] testedWords = new String[x.length];
        for( int i =0; i<x.length; i++) {
            if (wordCount(text1, x[i]) == 1) {
                count++;
            }
        }
        if (count != 0){
            count++;
        }
        return count;
    }
}
