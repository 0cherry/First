package combination_testing;

public class PizzaShop {
	int order_pizza(String dough, String topping, String order) {
		int pizza_price = 0;
		if(dough.equals("�"))
			pizza_price = 10000;
		if(dough.equals("������"))
			pizza_price = 12000;
		if(dough.equals("�� ũ����Ʈ"))
			pizza_price = 14000;
		if(topping.equals("�⺻"))
			pizza_price += 3000;
		if(topping.equals("�����̾�")) {
			pizza_price += 5000;
			if(order.equals("�¶���")) {
				pizza_price -= 1500;
				if(dough.equals("�� ũ����Ʈ"))
					pizza_price -= 500;
			}
		}
		
		return pizza_price;
	}
}
