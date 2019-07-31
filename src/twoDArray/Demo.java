package twoDArray;

import sorting.MergeSort;

public class Demo {

    public static void main(String[] args) {

        final int MEDALS = 3;
        final int COUNTRIES = 7;

        String[] countries = {
                "Canada", "China", "Germany", "Korea", "Japan", "Russia", "United States"};

        int[][] counts = {
                { 1, 0 ,1 },
                { 1, 1, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 },
                { 0, 1 ,1 },
                { 0, 1, 1 },
                { 1, 1, 0 }
        };

        System.out.println(counts.length);
        System.out.println(counts[0].length);

        System.out.println("        Country     Gold    Silver    Bronze    Total");

        // Print countries, counts, and row totals
        for (int i = 0; i < COUNTRIES; i++) {

            // Process the ith row
            System.out.printf("%15s", countries[i]);

            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < MEDALS; j++) {
                System.out.printf("%8d", counts[i][j]);
                total += counts[i][j];
            }

            // Display the row total and print a new line
            System.out.printf("%8d\n", total);
        }

        int grandTotal = 0;
        System.out.print( "Total");
        for (int col = 0; col < MEDALS; col++) {
            int total = 0;
            for (int row = 0; row < COUNTRIES; row++) {
                total += counts[row][col];

            }

            System.out.printf("%8d", total);
grandTotal+= total;
        }
        System.out.printf("%8d", grandTotal);

    }
}
