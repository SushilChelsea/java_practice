
public class GenericMethodBound {
    public static void main(String[] args) {
        /*
        int[] arr = {2, 8, 1, 4, 9, 7};
        Integer[] newArray = new Integer[arr.length];
        int i = 0;
        for (int value : arr) {
            newArray[i++] = Integer.valueOf(value);
        }
        int count = GenericMethodBound.<Integer>countGreaterThan(newArray, new Integer(3));
        */
        String[] strArr = {"a", "b", "c", "d"};
        int count = GenericMethodBound.countGreaterThan(strArr, "a");
        System.out.println(count);
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}