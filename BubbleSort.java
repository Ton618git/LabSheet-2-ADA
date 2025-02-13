package LabSheetWorkADA;
public class BubbleSort {
    public static int bubbleSort(int[] arr) {
        int stepCount = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                stepCount++;  
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    stepCount++;  
                }
            }
        }
        return stepCount;
    }

    public static void main(String[] args) {
        int[] arr = {35, 12, 48, 7, 22};
        int steps = bubbleSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nStep count: " + steps);
    }
}


