package day15_regex;

public class Main4 {
    public static void main(String[] args) {
//        String regex = "hello|hey";
//        System.out.println("hello".matches(regex));
//        System.out.println("hey".matches(regex));

        //uuhellox
        //uuheyx
//        String regex = "uu(hello|hey)x";
//        System.out.println("uuhellox".matches(regex));
//        System.out.println("uuheyx".matches(regex));

        //date
        //1-31
        String regex = "[1-9]|[12]\\d|3[01]";
        System.out.println("4".matches(regex));     //true
        System.out.println("16".matches(regex));    //true
        System.out.println("21".matches(regex));    //true
        System.out.println("30".matches(regex));    //true
        System.out.println("31".matches(regex));    //true
        System.out.println("32".matches(regex));    //false


    }
}
