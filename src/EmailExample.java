import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String GMAIL_EXAMPLE="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern= Pattern.compile(GMAIL_EXAMPLE);
    }
    public boolean valuedate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

}
