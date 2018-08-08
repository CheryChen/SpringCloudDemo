package com.hyeres.test;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(String[] strDate, int left, int right) {

        String middle, tempDate;

        int i, j;

        i = left;

        j = right;

        middle = strDate[(i + j) / 2];
        System.out.println("======left:"+left+",right:"+right+",middle:"+middle);

        do {

            while (strDate[i].compareTo(middle) < 0 && i < right)

                i++; // 找出左边比中间值大的数

            while (strDate[j].compareTo(middle) > 0 && j > left)

                j--; // 找出右边比中间值小的数

            if (i <= j) { // 将左边大的数和右边小的数进行替换

                tempDate = strDate[i];

                strDate[i] = strDate[j];

                strDate[j] = tempDate;

                i++;

                j--;
                System.out.println("=========strDate:"+Arrays.toString(strDate));

            }
            System.out.println("===i:"+i+",j:"+j);

        } while (i <= j); // 当两者交错时停止

        System.out.println("====i:"+i);
        if (i < right) {

            quickSort(strDate, i, right);// 从

        }
        System.out.println("=====j:"+j);

        if (j > left) {

            quickSort(strDate, left, j);

        }

    }

    public static void main(String[] args) {

        String[] strVoid = new String[] { "6","2","8","9","3","1","7" };

        QuickSort sort = new QuickSort();

        sort.quickSort(strVoid, 0, strVoid.length - 1);



    }

}