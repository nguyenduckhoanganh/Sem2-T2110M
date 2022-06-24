package lap14.lab14b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private String pattern;

    public Validator(String s) {

    }

    public void Validate(String pattern) {
        this.pattern=pattern;
    }
    public boolean validate(String value){
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(value);
        return m.matches();
    }

}
