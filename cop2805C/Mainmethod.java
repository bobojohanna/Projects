package cop2805C;

public class Mainmethod {


        public static void main(String[] args){
            final int length = 6;
           
            Array<Integer>int_Array = new Array<Integer>(length);
            System.out.print("Generic Array:" + " ");
            for (int i = 0; i < length; i++)
                int_Array.set(i, i * 1);
            System.out.println(int_Array);
            Array<String>str_Array = new Array<String>(length);
            System.out.print("Generic Array:" + " ");
            for (int i = 0; i < length; i++)
                str_Array.set(i, String.valueOf((char)(i + 97)));
            System.out.println(str_Array);
        }
    }
    
