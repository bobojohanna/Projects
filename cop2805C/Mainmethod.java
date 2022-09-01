package cop2805C;

public class Mainmethod {

    public static void main(String[] args) {
        Integer[] array = { 4, 9, 7, 3, 2, 8 };
        int value = 2;
//        int indexOfValue = (array.length);
        GenericArray genArray = new GenericArray();
        int index = genArray.findIndex(array, value);
        System.out.println("Index of " + value + " is " + index);

        Integer[] arr = { 22, 3, 76, -9, 4, -17, 90, 108, 129, -1, 109, 77, 87, 65, 45, -12, 101 };
//        indexOfValue = (arr.length);
//        GenericArray b = new GenericArray();
        value = 45;
        index = genArray.findIndex(arr, value);
        System.out.println("Index of " + value + " is " + index);

        Integer[] ar = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, -100, -101, -102, -103, -104 };
        value = 99;
//        indexOfValue = (ar.length);
//        GenericArray c = new GenericArray();
        index = genArray.findIndex(ar, value);
        System.out.println("Index of " + value + " is " + index);

        Double[] doubleArray = { 4.4, 5.1, 6.0, 2.1 };
        double dValue = 2.1;
//        indexOfValue = (doubleArray.length);
//        GenericArray d = new GenericArray();
        index = genArray.findIndex(doubleArray, dValue);
        System.out.println("Index of " + dValue + " is " + index);

        String[] strArray = { "hello", "3.4", "Jo", "-1.1" };
        String StrValue = "Jo";
//        indexOfValue = (strArray.length);
//        GenericArray e = new GenericArray();
        index = genArray.findIndex(strArray, StrValue);
        System.out.println("Index of " + StrValue + " is " + index);
    }
}
