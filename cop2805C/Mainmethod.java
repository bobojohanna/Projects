package cop2805C;
public class Mainmethod {

       

    public static void main(String[] args){
        int[] array = {4, 9, 7, 3, 2, 8};  
        int  value = 2;
        int indexOfValue = (array.length);
        Array a = new Array();
        int index = a.findIndex(array, value);
        System.out.println("Index of " + value + " is " + index);

        int [] arr = {22,3,76,-9,4,-17,90,108,129,-1,109,77,87,65,45,-12,101};
        value = 45;
        indexOfValue = (arr.length);
        Array b = new Array();
        index = b.findIndex(arr, value);
        System.out.println("Index of " + value + " is " + index);

        int [] ar = {100,101,102,103,104,105,106,107,108,109,110,111,-100,-101,-102,-103,-104};
        value = 99;
        indexOfValue = (ar.length);
        Array c = new Array();
        index = c.findIndex(ar, value);
        System.out.println("Index of " + value + " is " + index);

        float[] floatArray = {(float) 4.4, (float) 5.1, (float) 6.0, (float) 2.1};
        float fValue = (float) 2.1;
        indexOfValue = (floatArray.length);
        Array d = new Array();
        index = d.findIndex(floatArray, fValue);
        System.out.println("Index of " + value + " is " + index);

        String[] strArray = {"hello", "3.4", "Jo", "-1.1"};
        String StrValue = "Jo";
        indexOfValue = (strArray.length);
        Array e = new Array();
        index = e.findIndex(strArray, StrValue);
        System.out.println("Index of " + value + " is " + index);
    }
    }
