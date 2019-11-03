package course.java.enums.application;

import java.util.Date;

import course.java.enums.entities.Order;
import course.java.enums.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus orderStatus1 = OrderStatus.DELIVERED;

		OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(orderStatus1);
		System.out.println(orderStatus2);

	}

}
