public class Sorts{
  /**Bubble sort of an int array. 
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */

  
  public static void bubbleSort(int[] data){ 
  boolean sorted = false;
  for(int j = 0; j<data.length-1; j++){
  sorted = true;
  for (int i = 0; i < data.length - j-1; i++)
  if (data[i] > data[i + 1]){
  sorted = false;
  int temp = data[i];
  data[i] = data[i + 1];
  data[i+1] = temp;
  }
  }}

  /**selection sort of an int array. 
*@postcondition The array will be modified such that the elements will be in increasing order.
*@param data - the elements to be sorted.
*/
 public static void selectionSort(int[] data){ 
 for (int i = 0; i < data.length-1; i++){
 int smallest = data[i];
 for (int j = 0; j < data.length; j++){
 if (smallest > data[j])
 smallest = data[j];
 data[i] = smallest;
 smallest = data[i];}
 
 }
 }

 /**insertion sort of an int array. 
*@postcondition The array will be modified such that the elements will be in increasing order.
*@param data - the elements to be sorted.
*/
 public static void insertionSort(int[] data){
 }
   
}
