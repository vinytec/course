package course.java.enums.entities;

import java.util.Date;

import course.java.enums.entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;

	public Order(Integer id, Date moment, OrderStatus status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

}
