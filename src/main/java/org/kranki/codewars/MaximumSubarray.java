


package org.kranki.codewars;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] arr) {
        {
            if (arr.length == 0) {
                return 0;
            }

            int size = arr.length;
            int mxf = Integer.MIN_VALUE, maxhere = 0;
            int c = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] <= -1) {
                    c++;
                }
                maxhere = maxhere + arr[i];
                if (mxf < maxhere) {
                    mxf = maxhere;
                }
                if (maxhere < 0) {
                    maxhere = 0;
                }
            }
            if (c==arr.length){
                return 0;
            }
            return mxf;
        }
    }
}
