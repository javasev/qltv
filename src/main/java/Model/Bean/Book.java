package Model.Bean;

import java.util.Date;

public class Book {
	private String id;
	private String name;
	private String image;
	private String amount;
	private Category Category;
	private String day;
	private String location;
	private String tacgia;
	private String nxb;
	public Book() {
		super();
	}
	public Book(String id, String name, String image, String amount, Model.Bean.Category category, String day,
			String location, String tacgia, String nxb) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.amount = amount;
		Category = category;
		this.day = day;
		this.location = location;
		this.tacgia = tacgia;
		this.nxb = nxb;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Category getCategory() {
		return Category;
	}
	public void setCategory(Category category) {
		Category = category;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	
	
}
