package objectExercise;

// アパートメント
public class Apartment extends Property {

	/* ------------------------------
	 * コンストラクタ
	 * ------------------------------ */
	public Apartment(String name,String ownerName, long price, String floorPlan){
		super(name, ownerName, Category.APARTMENT, "アパートメント", price, floorPlan, -1);
	}

	// カテゴリ名(categoryName)指定用
	public Apartment(String name,String ownerName, String categoryName, long price, String floorPlan){
		super(name, ownerName, Category.APARTMENT, categoryName, price, floorPlan, -1);
	}
}
