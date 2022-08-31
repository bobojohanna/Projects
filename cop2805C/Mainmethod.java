package cop2805C;



public class Mainmethod {

        
       
        public static void main(String[] args){
            int[] array = {4, 9, 7, 3, 2, 8};  
            int  value = 2;
            int indexOfValue = (array.length);

            Array a = new Array();
            int index = a.findIndex(array, value);

            System.out.println("Index of " + value + " is " + index);

        }

        

      
    }
