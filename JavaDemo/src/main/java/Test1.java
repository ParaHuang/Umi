public class Test1 {
    //main method->entrance
    public static void main(String[] args) {
//        type variableName = value;
        int num1 = 1023820390;           //2^32
        double num2 = 3.1415926;

        //1byte = 8bit
        //2 byte,
        short num3 = 32767;     //2^16 numbers   -32768~0~32767
        long num4 = 10238203900l;
        float num5 = 3.14f;

        byte num6 = 127;

        boolean f = 3>6;

        //javascript:""      '' ->string
        //java:""->String
        //  ''->char
        char c = '8';
        String s = "hello";

        //print
//        System.out.print("hello\n");
//        System.out.print("world");
        //escapce character:
        //  \n      ->      new line
        //  \t      ->      tab
        //print a line  :sout
        System.out.println("hello");
        System.out.println("world");
        //num2=3.14
        //+ -> connecting, concat
        System.out.println("num2="+num2+",num3="+num3);

        //print with format
        //placeholder:   %d ->  int         %f
        System.out.printf("num1=%d,num2=%f\n",num1,num2);
        System.out.printf("num1=%d,num2=%.3f\n",num1,num2);
    }
}
//restful API