public class TestArray {

   public static void main(String[] args) {
      int[] myList = {6,34,32,48,5,22,47};

      // Print all the array elements
      for (int i = 0; i < myList.length - 1; i++) {
         int min = i;
         for (int j=i+1; j<myList.length; j++){
             if(myList[j] < myList[min]){
                 min = j;
             }
         }
         if (i != min){
             int temp = myList[i];
             myList[i] = myList[min];
             myList[min] = temp;
             
             
         }
      }
      // Summing all elements
      
      for (int k = 0; k < myList.length; k++) {
          System.out.println(myList[k]);
          
      }
     
   }
}