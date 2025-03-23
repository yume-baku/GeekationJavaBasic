package objectExercise;

// 土地
public class Land extends Property {

	/* ------------------------------
	 * コンストラクタ
	 * ------------------------------ */
	public Land(String name,String ownerName, long price, double area){
		super(name, ownerName, Category.LAND, "土地", price, null, area);
	}
}
