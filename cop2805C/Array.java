package cop2805C;

public class Array {

    private int index;

    public int findIndex(int[] array, int value, float[] floatArray, float fValue, String[] strArray, String StrValue) {

        if (array == null) {
            return -1;
        }

        int len = array.length;
        int i = 0;

        while (i < len) {

            // return the index
            if (array[i] == value) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}
