package co.grandcircus.restaurantrating;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ratings")
public class RestaurantEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	private Integer id;
	private String name;
	private double rating;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "RestaurantEntity [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	

}
