package cop2805C;

public class Array {

	public int findIndex(int array[], int value)
    {
  
      
        if (array == null) {
            return -1;
        }
  
       
        int len = array.length;
        int i = 0;
  
       
        while (i < len) {
  
            
            //return the index
            if (array[i] == value) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }


}
