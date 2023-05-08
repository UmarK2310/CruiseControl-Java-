
public class Food {
	private int Foodno;
	private String FoodCategory;
	private int Foodrate;
	
	public Food(int Foodno,int Foodrate,String FoodCategory){
		this.FoodCategory = FoodCategory;
		this.Foodno = Foodno;
		this.Foodrate = Foodrate;
	}

	public int getFoodno() {
		return Foodno;
	}

	public void setFoodno(int foodno) {
		Foodno = foodno;
	}

	public String getFoodCategory() {
		return FoodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		FoodCategory = foodCategory;
	}

	public int getFoodrate() {
		return Foodrate;
	}

	public void setFoodrate(int foodrate) {
		Foodrate = foodrate;
	}

}
