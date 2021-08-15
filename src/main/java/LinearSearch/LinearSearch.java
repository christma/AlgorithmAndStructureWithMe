package LinearSearch;

import java.util.LinkedList;

public class LinearSearch {

    private LinearSearch() {
    }

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int res = LinearSearch.search(data, 16);


        Integer[] datas = {24, 18, 12, 9, 16, 66, 32, 4};
        int search = LinearSearch.search(datas, 666);
        System.out.println(search);
        System.out.println(res);


        Student[] students = {new Student("Alice"),new Student("Bobo"),new Student("Charles")};

        Student bobo = new Student("Bobo");


        int search1 = LinearSearch.search(students, bobo);
        System.out.println(search1);

    }

}
