package HibernateManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "items")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	float price;
	
	@ManyToMany
	List<Category> categories;
	
	Item(String name, float price) {
		this.name = name;
		this.price = price;
	}
}
