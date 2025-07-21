package day2_array;

public class Test1 {
    public static void main(String[] args) {
//        int a=10,b=3,c=99,d=6,e=9;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

        //define an int array to save 5 numbers
//        type[]  arrayName = new type[length];
        int[] arr = new int[9];

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        //i++       ->      i+=1
        for(int i=0 ;  i<arr.length  ; i++){
            System.out.println("element "+(i)+":"+arr[i]);
//            arr[i] = 10+i*3;
        }

        //get very element out  1 by 1, saving the value in a temporary space x
        //changing x would affect the original array
//        for(int x : arr){
//            x = 8;
//        }

        //more for reading
        //enhanced for loop/foreach: get every element out 1 by 1 without considering index
//        for(int x : arr){
//            System.out.println(x);
//        }

    }
}
