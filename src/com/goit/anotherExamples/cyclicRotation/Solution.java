package com.goit.anotherExamples.cyclicRotation;
/*
A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 */

public class Solution {

        public int [] solution(int [] A, int K)
        {
            int N = A.length;
            if (N==0)
            return A;
            if ((K > N)||(K < 0))
            System.out.println("Please enter K more than 0 and less than" + A.length);
            if ((K == 0) || (K == N))
                return A;
            int[] rotA = new int[N];
            for (int i = 0; i < N; i++)
            rotA[i] = (i < K) ? A[N + i - K] : A[i - K];
            return rotA;
        }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = solution.solution(new int[] {2,3,5,6,7}, 45);
        for (int i = 0; i < A.length; i++)
            System.out.print(" " + A[i]);
        }

    }

