package Demo;

public class DefaultValue {
    byte bt;
    short st;
    int it;
    long l;
    float ft;
    double d;
    boolean b;
    char c;
    String s;

    public static void main(String[] args) {
        DefaultValue obj = new DefaultValue();
        //Default value of primitive and object
        System.out.println("Default value of Byte = "+obj.bt);
        System.out.println("Default value of Short = "+obj.st);
        System.out.println("Default value of Integer = "+obj.it);
        System.out.println("Default value of Long = "+obj.l);
        System.out.println("Default value of Float = "+obj.ft);
        System.out.println("Default value of Double = "+obj.d);
        System.out.println("Default value of Boolean = "+obj.b);
        System.out.println("Default value of Character = "+obj.c);
        System.out.println("Default value of String(object) = "+obj.s);
    }
}