import java.util.Scanner;
public class bs{
public static int binarysearch(int arr[], int low , int high, int search){
int mid = (low+high)/2;
if(low>high)
return -1;
if (search==arr[mid])
return mid;
else if (search >arr[mid])
return binarysearch(arr , mid+1, high , search);
else
return binarysearch(arr , low, mid-1, search);
}
public static void main (String [] args ){
Scanner sc = new Scanner(System.in);
System.out.println("enter the array size");
int n= sc.nextInt();
int arr[]=new int [n];
System.out.println("enter the elements of the array:");
for(int i = 0; i<n;i++)
arr[i]= sc.nextInt();
System.out.println("enter the search element:");
int search = sc.nextInt();
int result = binarysearch(arr,0,n-1,search);
System.out.println(result);
}}