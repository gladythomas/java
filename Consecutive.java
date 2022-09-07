//package brush_up_java;
import java.util.Scanner;
//import java.util.ArrayList;
public class Consecutive {
    Scanner sc=new Scanner(System.in); 
  
  

  int n;  
  
  System.out.println("Enter the Coordinates");  
  //reading the number of elements from the that we want to enter  
  n=sc.nextInt();  
  //creates an array in the memory of length 10  
  int[] array = new int[10];  
  System.out.println("Enter the elements of the array: ");  
  for(int i=0; i<n; i++)  
  {  
  //reading array elements from the user   
  array[i]=sc.nextInt();  
  }  
  System.out.println("Array elements are: ");  
  // accessing array elements using the for loop  
  for (int i=0; i<n; i++)   
  {  
  System.out.println(array[i]);  
  }  
  }  
   
 
  
  
    




}
