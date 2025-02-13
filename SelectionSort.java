package LabSheetWorkADA;
public class SelectionSort {
    public static int selectionSort(int[] arr) {
        int stepCount = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                stepCount++;  
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            stepCount++;  
        }
        return stepCount;
    }

    public static void main(String[] args) {
        int[] arr = {35, 12, 48, 7, 22};
        int steps = selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nStep count: " + steps);
    }
}


