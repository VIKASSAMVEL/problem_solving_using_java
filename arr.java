import java.util.Scanner;
public class arr{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array:");
int n= sc.nextInt();
int arr[]=new int [n];
System.out.println("enter the elements of the array:");
for (int i =0; i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("enter the index of the element you want to find:");
int target=sc.nextInt();
if (target >=0 && target <n){
System.out.println("element found at target index:");
System.out.print(arr[target]);
}
else
System.out.println("target out of index");
}}