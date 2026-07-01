package ArrayProgramming;

public class FreqDuplicate {

    public static void main(String[] args) {

        int[] a = {8,2,6,6,7,8,8,9,5};

        for (int x : a)
            System.out.print(x + " ");

        System.out.println("\n");
        printFrequencyArray(a);
    }

    public static void printFrequencyArray(int[] a) {

        int n = a.length - 1;

        System.out.println("Frequency:");    
        String duplicates = "";

        for (int i = 0; i <= n; i++) {

            int count = 1;

            for (int j = i + 1; j <= n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = a[n];
                    n--;
                    j--;
                }
            }

            System.out.println(a[i] + " is : " + count + " time");

            if (count > 1) {
                duplicates = duplicates + a[i] + " ";
            }
        }

        // print duplicates AFTER frequency
        System.out.println("Duplicate elements: " + duplicates);
    }
}

