package StreamAssignment;

public class Fruit {
	private String Name;
	private int Calories;
	private int Price;
	private String Color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		Name = name;
		Calories = calories;
		Price = price;
		Color = color;
	}
	public String getName() {
		return Name;
	}
	public int getCalories() {
		return Calories;
	}
	public int getPrice() {
		return Price;
	}
	public String getColor() {
		return Color;
	}
	
	

}
