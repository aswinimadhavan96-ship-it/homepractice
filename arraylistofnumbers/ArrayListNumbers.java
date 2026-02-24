package arraylistofnumbers;

import java.util.Arrays;


public class ArrayListNumbers {

    
    public static void main(String[] args) 
    {
        int arr[] = {9, 4, 3, 2, 7, 8, 5};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]%2!=0 && arr[j]%2!=0)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                                
                    }
                }
                if(arr[i]%2==0 && arr[j]%2==0)
                {
                    if(arr[i]<arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
 
        System.out.println(Arrays.toString(arr));
    }
    
    
    
}