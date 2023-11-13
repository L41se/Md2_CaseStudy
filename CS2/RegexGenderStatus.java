package CS2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGenderStatus {



    private static final String Gender="^[Mm][Aa][Ll]+|[Ff][Ee][Mm][Ae][Ll][Ee]$";
    private static final String Status="^[Tt][Rr][Uu][Ee]+|[Ff][Aa][Ll][Ss][Ee]$";

    public RegexGenderStatus() {
    }
    public static boolean validateGender(String regex){
        Pattern pattern=Pattern.compile(Gender);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }
    public static boolean validateStatus(String regex1){
        Pattern pattern=Pattern.compile(Status);
        Matcher matcher=pattern.matcher(regex1);
        return matcher.matches();
    }

}
