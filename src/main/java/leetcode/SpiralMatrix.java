package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> SpiralMatrix(int[][] matrix){
        List<Integer> spiralmatrix = new ArrayList<>();
        int rowstart = 0, columnstart = 0, rowend = matrix.length-1, columnend = matrix[0].length-1;
        while(rowstart <= rowend && columnstart<= columnend){
            for(int i = rowstart;i <= rowend;i++){
                spiralmatrix.add(matrix[i][columnstart]);
            }
            for(int j = columnstart+1;j <= columnend;j++){
                spiralmatrix.add(matrix[rowstart][j]);
            }
            if(rowstart<rowend){
                for(int i = rowend-1;i >= rowstart;i--){
                    spiralmatrix.add(matrix[i][columnend]);
                }
            }
            if(columnstart<columnend){
                for(int j = rowend-1;j > rowstart;j--){
                    spiralmatrix.add(matrix[columnstart][j]);
                }
            }
            rowstart++ ;
            rowend-- ;
            columnstart++ ;
            columnend-- ;
        }
        return spiralmatrix;
    }
}
