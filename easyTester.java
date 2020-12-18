import java.util.Arrays;

public class easyTester {

  public static void main(String[]args) {
  int[] number1 = {-100,25,-9,839, 385734, -9348348};
  Sorts.bubbleSort(number1);
  System.out.println(Arrays.toString(number1));
  int[] number2 = {0,0,0};
  Sorts.bubbleSort(number2);
  System.out.println(Arrays.toString(number2));
  int[] number3 = {};
  Sorts.bubbleSort(number3);
  System.out.println(Arrays.toString(number3));
  int[] number4 = {5,4,3,2,1,0,-1,-2,-3,-4,-5};
  Sorts.bubbleSort(number4);
  System.out.println(Arrays.toString(number4));

  }

}
