package org.example;

public class DataTypes {
    public static void main(String[] args) {
//        <---------------- Primitive Data Types -------------->
        byte age = 22;
        short pin = 12365;
        int id = 193071002;
        char gender ='M';
        long phone = 1946363345L;
        float height = 5.56f;
        double pi = 3.14285714285714344;
        boolean isSingle = true;
        System.out.println("Age : "+age);
        System.out.println("Pin : "+pin);
        System.out.println("ID : "+id);
        System.out.println("Gender : "+gender);
        System.out.println("Height : "+height);
        System.out.println("Phone : "+phone);
        System.out.println("Value of (22/7) : "+pi);
        System.out.println("Single : "+isSingle);
        System.out.println();

        System.out.println("======================== Maximum and Minimum value of primitive data types ===============");

        System.out.println("Byte takes 1 Byte Memory (🪣) ");
        System.out.println("Max value of Byte = "+Byte.MAX_VALUE);
        System.out.println("MIN value of Byte = "+Byte.MIN_VALUE);
        System.out.println();

        System.out.println("Short takes 2 Byte Memory (🪣🪣)");
        System.out.println("Max value of Short = "+Short.MAX_VALUE);
        System.out.println("MIN value of Short = "+Short.MIN_VALUE);
        System.out.println();

        System.out.println("Integer takes 4 Byte Memory (🪣🪣🪣🪣)");
        System.out.println("Max value of Integer = "+Integer.MAX_VALUE);
        System.out.println("MIN value of Integer = "+Integer.MIN_VALUE);
        System.out.println();

        System.out.println("Character takes 2 Byte Memory (🪣🪣)");
        System.out.println("Max value of Character = "+Character.MAX_VALUE);
        System.out.println("MIN value of Character = "+Character.MIN_VALUE);
        System.out.println();

        System.out.println("Long takes 8 Byte Memory (🪣🪣🪣🪣🪣🪣🪣🪣)");
        System.out.println("Max value of Long = "+Long.MAX_VALUE);
        System.out.println("MIN value of Long = "+Long.MIN_VALUE);
        System.out.println();

        System.out.println("Float takes 4 Byte Memory (🪣🪣🪣🪣)");
        System.out.println("Max value of Float = "+Float.MAX_VALUE);
        System.out.println("MIN value of Float = "+Float.MIN_VALUE);
        System.out.println();

        System.out.println("Double takes 8 Byte Memory (🪣🪣🪣🪣🪣🪣🪣🪣)");
        System.out.println("Max value of Double = "+Double.MAX_VALUE);
        System.out.println("MIN value of Double = "+Double.MIN_VALUE);
        System.out.println();

        System.out.println("Boolean takes 1 Byte Memory  but it depends on (🤖)");

    }
}