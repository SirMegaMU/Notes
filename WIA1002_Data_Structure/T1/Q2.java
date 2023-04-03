public class Q2 {
    public class MyArray {
        public static void main(String[] args) {
            Integer[] IntArray = {1, 2, 3, 4, 5};
            String[] StrArray1 = {"Jane", "Tom", "Bob"};
            String[] StrArray2 = {"a", "b", "c"};

            listAll(IntArray);
            listAll(StrArray1);
            listAll(StrArray2);
        }

        public static <T> void listAll(T[] input) {
            {
                for (T element : inputArray) {
                    System.out.printf("%s ", element);
                }
                System.out.println();
            }
        }
    }
}