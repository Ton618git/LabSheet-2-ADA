package LabSheetWorkADA;

public class InsertionSort {
    public static int insertionSort(int[] arr) {
        int stepCount = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                stepCount++;  
            }
            arr[j + 1] = key;
            stepCount++;  
        }
        return stepCount;
    }

    public static void main(String[] args) {
        int[] arr = {35, 12, 48, 7, 22};
        int steps = insertionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nStep count: " + steps);
    }
}

