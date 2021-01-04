import java.util.*;
public class Rotate_Binary {
    static int count(int arr[],int low,int high)
    {
        int mid=low+(high-low)/2;
        if(mid<high && arr[mid+1]<arr[mid])
        {
        return (mid+1);
        }
        //check mid itself is minimum number
        if(mid>low && arr[mid]<arr[mid-1])
        {
            return mid;
        }
        //decide which side we have to go
        if(arr[high]>arr[mid])
        {
            return count(arr,low,mid-1);//left
        }
        return count(arr,mid+1,high);//right
    }
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int arr[]=new int[6];
            System.out.println("Enter the array elements");
            for(int i=0;i<6;i++)
            {
                arr[i]=sc.nextInt();
            }
            int n=6;
            System.out.println(count(arr,0,n-1));
        }
    
}
