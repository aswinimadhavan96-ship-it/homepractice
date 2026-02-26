package distinctnumbers;
import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {

        public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        
        int n=obj.nextInt();
        int arr[]=new int[n];
        int result[]=new int[10];
        int count=0;
        System.out.println("Enter the numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("arr["+i+"] :");
            arr[i]=obj.nextInt();
        }
        for(int num:arr)
        {
            while(num>0)
            {
                int digit=num%10;
                boolean found=false;
                for(int i=0;i<count;i++)
                {
                    if(result[i]==digit)
                    {
                        found=true;
                        break;
                    }
                }
                    if(!found)
                    {
                        result[count]=digit;
                        count++;
                    }
                    num=num/10;
                }
            }
        
        for(int i=0;i<count-1;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(result[i]>result[j])
                {
                   int temp=result[i];
                   result[i]=result[j];
                   result[j]=temp;
                }
                
            }
        }
        System.out.println("Distinct numbers : ");
        for(int i=0;i<count;i++)
        {
            System.out.println(result[i]);
        }
    }
    
}
