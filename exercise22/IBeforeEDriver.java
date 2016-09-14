import java.io.InputStream;
import java.util.ArrayList;
import java.net.URL;

public class IBeforeEDriver {
  public static void main(String[] args) throws Exception {
    // FileInputStream file = new FileInputStream("datafiles/en-sample.txt");
    String url = "https://www.gutenberg.org/files/408/408-h/408-h.htm";
    InputStream u = new URL(url).openStream();

    IBeforeEChecker check = new IBeforeEChecker(u);
    System.out.println(check.getWordCount() + " ie/ei words found.");
    System.out.print("\t" + check.getMatches() + " match the rule, ");
    System.out.print(check.getExceptions() + " do not: ");
    System.out.println(100.0 * check.getMatches()/check.getWordCount() + "%");

    // ArrayList<String> listOfWords = check.getWordList();
    // int i = 1;
    // System.out.println("Here is a list of words found to match the rule: ");
    // for(String word : listOfWords) {
    //   System.out.println(i + ": " + word);
    //   i++;
    // }
  }
}
