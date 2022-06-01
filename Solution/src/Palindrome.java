import com.sun.security.jgss.GSSUtil;

public class Palindrome {
    public static void main(String[] args) {
        String s="MalayalaM";
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
        String rs=sb.toString();
        if(s.equals(rs)){
            System.out.println("It's a Palindrome");
        }
        else{
            System.out.println("It's Not a Palindrome");
        }

    }
}
