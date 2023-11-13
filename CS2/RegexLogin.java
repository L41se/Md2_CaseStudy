package CS2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLogin{
    private static final String USERNAME_REGEX = "\"^[a-zA-Z0-9_]{3,20}$\"";
    private static final String PASSWORD_REGEX = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
    public RegexLogin(){}
    public static boolean validateUsername(String username){
        Pattern pattern = Pattern.compile(USERNAME_REGEX);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
    public static boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
