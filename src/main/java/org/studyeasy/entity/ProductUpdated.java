package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name ="product_updated")
public class ProductUpdated {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
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


	@Override
	public String toString() {
		return "ProductUpdated [product_id=" + product_id + ", product_name=" + product_name + ", category=" + category
				+ ", price=" + price + ", image_url=" + image_url + ", stock=" + stock + "]";
	}

	
}
