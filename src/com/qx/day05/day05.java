package com.qx.day05;


public class day05 {

    public static void main(String[] args) {


        int arr[] = new int[]{13, 26, 22, 22, 35, 18};//要进行排序的数组
        int res[] = (int[]) bubbleSort(arr);//获取到排序后到数组

        //循环遍历出内容
        for (int i : res) {
            System.out.println(i);
        }

    }


    public static int[] bubbleSort(int[] arr) {
        int temp;//定义一个临时变量
        for (int i = 0; i < arr.length - 1; i++) {//冒泡趟数
            for (int j = 0; j < arr.length - i - 1; j++) {
                //如果顺序不对，则交换两个元素
                if (arr[j + 1] < arr[j]) {//如果后一个数小于前一个数
                    temp = arr[j];//临时赋值
                    arr[j] = arr[j + 1];//后一个数赋值给前面
                    arr[j + 1] = temp;//前一个给后面    就是两个数的位置 进行了交换
                }
            }
        }
        return arr;
    }
}
