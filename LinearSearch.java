class LinearSearch
{

   
    static int linearSearch(int[] arr, int value) 
	{

        for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] == value) {
                return i;  
            }
        }
        return -1; 
    }

    public static void main(String[] args)
	{

        int[] arr = {10, 20, 30, 40, 50};
        int value = 30; 

        int result = linearSearch(arr, value);
        System.out.println("Index: "+result);
    }
}
