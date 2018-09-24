public class TimesTable {
    /** function that generates a multiplication table
     *
     * @param first
     * @param second
     * @return returns the table
     */
    public static int[][] generateTimesTable(int first, int second) {
        if (first < 0 || second < 0) {
            return null;
        }
        if (first > second) {
            return null;
        }
        int arraySize = second - first + 2;
        int[][] table = new int[arraySize][arraySize];
        int[] numbers = new int[arraySize];
        numbers[0] = 0;
        int i = 1;
        for (int j = first; j <= second; j++) {
            numbers[i] = j;
            i++;
        }
        table[0] = numbers;
        i = 1;
        for (int j = first; j <= second; j++) {
            table[i][0] = j;
            i++;
        }
        for (int j = 1; j < arraySize; j++) {
            for (i = 1; i < arraySize; i++) {
                table[j][i] = table[j][0] * numbers[i];
            }
        }
        return table;
    }
    public static void main(String[] args) {

    }
}
