package LinearSearch;

public class LinearSearch {

    public int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        LinearSearch ls = new LinearSearch();
        int res = ls.search(data, 16);
        System.out.println(res);
    }

}
