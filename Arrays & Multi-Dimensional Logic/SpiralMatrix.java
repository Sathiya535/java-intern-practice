

import java.util.Scanner;

class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        spiral(a);
        
    }
    public static void spiral(int[][] a){
        int top=0;
        int bottom=a.length-1;
        int left=0;
        int right=a[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
                
            }
            right--;
            if(!(top<=bottom && left<=right)){
                break;
            }
            for(int i=right;i>=left;i--){
                 System.out.print(a[bottom][i]+" ");
                
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                 System.out.print(a[i][left]+" ");
                
            }
            left++;
        }
    }
}