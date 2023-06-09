package in.ineuron.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
	@Table(name = "orders")
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
	public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String itemName;

	    @ManyToOne(cascade = {
    CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH		
    },fetch = FetchType.EAGER)
	    @JoinColumn(name = "user_id")
	    private User user;

		@Override
		public String toString() {
			return "Order [id=" + id + ", itemName=" + itemName +  "]";
		}

	   
	}

