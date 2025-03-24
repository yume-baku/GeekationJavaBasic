package objectExercise;

// 不動産
public abstract class Property {

	/* ------------------------------
	 * 定数
	 * ------------------------------ */
	protected enum Category {
		APARTMENT, // アパート
		LAND       // 土地
	}

	/* ------------------------------
	 * プロパティ
	 * ------------------------------ */
	// 物件名
	private String name;

	// 物件所有者名
	private String ownerName;

	// 物件種別
	private Category propetyCategory;

	// 物件種別名称 ※物件種別と1:N
	private String categoryName;

	// 物件価格 単位:円
	private long price;

	// 間取り
	private String floorPlan;

	// 広さ 単位:平方メートル
	private double area;

	/* ------------------------------
	 * Getter / Setter
	 * ------------------------------ */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Category getPropetyCategory() {
		return propetyCategory;
	}

	public void setPropetyCategory(Category propetyCategory) {
		this.propetyCategory = propetyCategory;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getFloorPlan() {
		return floorPlan;
	}

	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	/* ------------------------------
	 * コンストラクタ
	 * ------------------------------ */
	protected Property(String name,String ownerName, Category category, String categoryName, long price, String floorPlan, double area){
		this.setName(name);
		this.setOwnerName(ownerName);
		this.setPropetyCategory(category);
		this.setCategoryName(categoryName);
		this.setPrice(price);
		this.setFloorPlan(floorPlan);
		this.setArea(area);
	}

	/* ------------------------------
	 * メソッド
	 * ------------------------------ */
	// 情報表示
	public void displayInformation(){

		// HACK: 下記の要素が可変(パラメータがない場合は非表示)で、
		//       必須パラメータが絞られる使用の場合はBuilderパターンのほうが望ましいはず
		System.out.println("=============================");
		System.out.println("物件名：" + this.getName());
		System.out.println("物件所有者名：" + this.getOwnerName());
		System.out.println("物件種別：" + this.getCategoryName());
		System.out.println("物件価格：" + this.getPrice() + "円");

		switch(this.getPropetyCategory()){
			case Category.APARTMENT:
				System.out.println("間取り：" + this.getFloorPlan());
				break;

			case Category.LAND:
				System.out.println("広さ：" + getArea() + "㎡");
				break;

			default:
				break;
		}
		System.out.println("=============================");
	}


}
