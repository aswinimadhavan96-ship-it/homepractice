class BinarySearch
 {


    static int binarySearch(int[] arr, int search)
	{
        int left = 0;
        int right = arr.length - 1;

        while (left<= right)
			{
            int mid = (left+ right) / 2;

            if (arr[mid] == search) 
				{
					return mid;   
				} else if (arr[mid] < search)
				{
					left = mid + 1;
				} else
				{
					right = mid - 1;
				}
			}
        return -1;  

		}

    public static void main(String[] args)
	{

        int[] arr = {2, 5, 8, 12, 16, 23, 38};

        int search = 16;   
        int result = binarySearch(arr, search);
        System.out.println(result);
    }
}
