package com.example;
public class Matrix {
    public static int[][] prod(int[][] arr1, int[][] arr2) {
        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int n2 = arr2[0].length;
        int[][] ans = new int[m1][n2];
        int temp;
        for (int r1 = 0; r1 < m1; r1++) {
            for (int c2 = 0; c2 < n2; c2++) {
                temp = 0;
                for (int c1 = 0, r2 = 0; c1 < n1; c1++, r2++) {
                    temp += (arr1[r1][c1] * arr2[r2][c2]);
                }
                ans[r1][c2] = temp;
            }
        }

        return ans;
    }
}