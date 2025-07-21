package day2_array;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int[][] matrix = new int[row][column];
//        int[][] matrix = {
//              // 0  1  2  3
//                {22,55,88,66},              //->index:0
//                {33,12,45,76},              //->index:1
//                {76,99,88,77}               //->index:2
//        };

//        Random random = new Random();

        //small box of cigar
        //
//        System.out.print(matrix[0][0]+" ");
//        System.out.print(matrix[0][1]+" ");
//        System.out.print(matrix[0][2]+" ");
//        System.out.print(matrix[0][3]+" ");
//        System.out.println();
//
//        System.out.print(matrix[1][0]+" ");
//        System.out.print(matrix[1][1]+" ");
//        System.out.print(matrix[1][2]+" ");
//        System.out.print(matrix[1][3]+" ");
//        System.out.println();
//
//        System.out.print(matrix[2][0]+" ");
//        System.out.print(matrix[2][1]+" ");
//        System.out.print(matrix[2][2]+" ");
//        System.out.print(matrix[2][3]+" ");
//        System.out.println();

        for(int i=0 ; i< matrix.length ; i++){          //i->row

//            System.out.print(matrix[i][0]+" ");
//            System.out.print(matrix[i][1]+" ");
//            System.out.print(matrix[i][2]+" ");
//            System.out.print(matrix[i][3]+" ");

//            for(int j=0 ; j<matrix[i].length ; j++){       //j->column
//                System.out.print(matrix[i][j]+" ");
//            }
            for(int x :matrix[i]){
                System.out.print(x+" ");
            }


            System.out.println();
        }

    }
}
