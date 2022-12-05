package Demo;
/**
 == [ it is used for object reference, if both reference are same then True ]
 .equals() [ it is used for content comparable, if both content are same then True ]
 * */
public class EqualOperatorAndMethod {
    public static void main(String[] args) {
        String s1 = new String("mohacel");
        String s2 = new String("mohacel");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

