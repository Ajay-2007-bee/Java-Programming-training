package Entity;

public class Product {
	
	private int prodId;
	private String proName;
	private String category;
	private float price;
	private int stockCount;
	
	public Product(int prodId, String proName, String category, float price, int stockCount) {
		
		this.prodId = prodId;
		this.proName = proName;
		this.category = category;
		this.price = price;
		this.stockCount = stockCount;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", proName=" + proName + ", category=" + category + ", price=" + price
				+ ", stockCount=" + stockCount + "]";
	}
	
}
