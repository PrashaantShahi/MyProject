/*write a java program to input an array and use  a method which is having the array and the searched element in argument.Search the element using binary 
 * search and if element is found return true otherwise return false. */
package newAssignment;

import java.util.Scanner;

public class BinaryMethod {

	public static int binarySearch(int arr[], int first, int last, int n){  
        if (first<=last){  
            int mid = first + last/2;  
            if (arr[mid] == n){  
            return mid;  
            }  
            if (arr[mid] > n){  
            return binarySearch(arr, first, mid-1, n);
            }else{  
            return binarySearch(arr, mid+1, last, n);
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to found:");
        int n=sc.nextInt();
        int first=0;
        int last=arr.length-1;  
        int result = binarySearch(arr,first,last,n);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }    
}
