class Foodi
{
	public static void main(String[] args)
	{
		String FoodName="Paneer Butter Masala";
		String cuisineType="indian";
		float price=250.50f;
		boolean isvegetarian=true;
		{
			System.out.println("FoodName="+FoodName);
			System.out.println("cuisineType="+cuisineType);
			System.out.println("price="+price);
			
		if(isvegetarian)
		{
			System.out.println("vegetarian");
		}else
		{
				System.out.println("non-vegetarian");
		}
		}
	}
}