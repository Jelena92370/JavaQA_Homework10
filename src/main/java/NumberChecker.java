import java.util.regex.Pattern;

public class NumberChecker {

    private String phonePattern = "(\\d{3}[-\\s]?\\d{4})";

    public NumberChecker() {

    }

    public NumberChecker(String phonePattern) {
        this.phonePattern = phonePattern;
    }

    public boolean isCorrectNumber(String autoNumber) {
        Pattern pattern = Pattern.compile(phonePattern);
        return pattern.matcher(autoNumber).matches();
    }


}
