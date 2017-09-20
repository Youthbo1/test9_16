package practice9_18;

import java.util.Arrays;


public class SelectSort {
    public static void selectDirectlySort(int[] a) {
        if (a == null) return;
        int min = 0;
        int i = 0;
        int j = 0;
        int index = 0;
        int len = a.length;
        for (i = 0; i < len - 1; i++) {
            min = a[i];
            index = i;
            for (j = i + 1; j < len; j++) {
                if (a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }
            a[index] = a[i];
            a[i] = min;
        }
    }

    public static void heapSort(int[] array) {
        if (array == null) return;
        buildHeap(array);//构建堆
        int n = array.length;
        int i = 0;
        for (i = n - 1; i >= 1; i--) {
            swap(array, 0, i);
            heapify(array, 0, i);
        }
    }
    //构建
    public static void buildHeap(int[] array) {
        int n = array.length;//数组中元素的个数
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, i, n);
    }
    public static void heapify(int[] A, int idx, int max) {
        int left = 2 * idx + 1;// 左孩子的下标（如果存在的话）
        int right = 2 * idx + 2;// 左孩子的下标（如果存在的话）
        int largest = 0;//寻找3个节点中最大值节点的下标
        if (left < max && A[left] > A[idx])
            largest = left;
        else
            largest = idx;
        if (right < max && A[right] > A[largest])
            largest = right;
        if (largest != idx) {
            swap(A, largest, idx);
            heapify(A, largest, max);
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void Test(int a[], int b[]) {
        System.out.println("The Source Secquence:");
        if (a == null) return;
        System.out.println(Arrays.toString(a));

        selectDirectlySort(a);
        System.out.println("BubbleSort Result: ");
        System.out.println(Arrays.toString(a));

        heapSort(b);
        System.out.println("QuickSort Result:");
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void main(String[] args) {
        int a1[] = null;
        int a2[] = {1};
        int a3[] = {3, 6, 1, 8, 2, 9, 4};
        int a4[] = {1, 3, 5, 7, 9};
        int a5[] = {6, 9, 4, 8, -1};
        int a6[] = {9, 5, 4, 2, 1};
        int b1[] = null;
        int b2[] = {1};
        int b3[] = {3, 6, 1, 8, 2, 9, 4};
        int b4[] = {1, 3, 5, 7, 9};
        int b5[] = {6, 9, 4, 8, -1};
        int b6[] = {9, 5, 4, 2, 1};
        Test(a1, b1);
        Test(a2, b2);
        Test(a3, b3);
        Test(a4, b4);
        Test(a5, b5);
        Test(a6, b6);
    }
}