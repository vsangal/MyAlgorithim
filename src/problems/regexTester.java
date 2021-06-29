import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTester{
    public static void showMatches(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> found = new ArrayList<>();
    
        while (matcher.find()) {
            found.add(matcher.group());
        }
    
        System.out.println(found);
    }
    
    public static void main (String[] args) {
        showMatches("riffraff", ".+?f+");
        showMatches("riffraff", "r[^f]?");
        showMatches("riffraff", ".+?f");
        showMatches("riffraff", "^r.ff??");
        showMatches("riffraff", "r.*?f");
        showMatches("riffraff", ".+f");
    }
}