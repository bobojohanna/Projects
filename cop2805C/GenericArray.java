package cop2805C;

public class GenericArray<T>{

    public int findIndex(T[] array, T value) {

        if (array == null) {
            return -1;
        }

        int len = array.length;
        int i = 0;

        while (i < len) {
            // return the index
            if (array[i].equals(value)) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}
