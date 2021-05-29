package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name ="check_out")
public class CheckOut {
	
	 @Id
	 @Column(name = "product_id")
	 int product_id;
	
	@NotNull
	@Column(name = "product_name")
	String product_name;

	@NotNull
	@Column(name = "category ")
	String category ;
	
	@NotNull
	@Column(name = "price")
	Long  price;
	

	@NotNull
	@Column(name = "image_url ")
	String image_url ;
	
	
	@NotNull
	@Column(name = "stock")
	int stock;
	
	@NotNull
	@Column(name = "username")
	String username;
	
	@NotNull
	@Column(name = "name")
	String name;
	
	@NotNull
	@Column(name = "address1")
	String address1;
	
	@NotNull
	@Column(name = "address2")
	String address2;

	@NotNull
	@Column(name = "city")
	String city;

	public CheckOut() {
		
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CheckOut [product_id=" + product_id + ", product_name=" + product_name + ", category=" + category
				+ ", price=" + price + ", image_url=" + image_url + ", stock=" + stock + ", username=" + username
				+ ", name=" + name + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + "]";
	}
     
	
	
	

	
}
