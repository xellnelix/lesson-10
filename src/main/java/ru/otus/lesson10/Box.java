package ru.otus.lesson10;

public class Box {
	private final double length;
	private final double height;
	private final double width;
	private String color, item;
	private boolean isOpen;

	public Box(double length, double height, double width) {
		this.length = length;
		this.height = height;
		this.width = width;
		color = "Белый";
		isOpen = false;
		item = "";
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean getIsOpen() {
		return isOpen;
	}

	public void open() {
		isOpen = true;
		System.out.println("Открыли коробку");
	}

	public void close() {
		isOpen = false;
		System.out.println("Закрыли коробку");
	}

	public void repaint(String color) {
		this.color = color;
		System.out.println("Перекрасили коробку в " + color);
	}

	public void getBoxInfo() {
		System.out.println("\nДлина: " + length);
		System.out.println("Ширина: " + width);
		System.out.println("Высота: " + height);
		System.out.println("Цвет: " + color);
		if (isOpen) {
			System.out.println("Коробка открыта");
		} else {
			System.out.println("Коробка закрыта");
		}
		if (!item.isEmpty()) {
			System.out.println("В коробке есть предмет " + item + "\n");
		} else {
			System.out.println("Коробка пустая\n");
		}
	}

	public void putItem(String item) {
		if (!isOpen) {
			System.out.println("Нельзя положить предмет в закрытую коробку");
			return;
		}
		if (item == null || item.isEmpty()) {
			System.out.println("В коробке уже есть предмет");
			return;
		}
		this.item = item;
		System.out.println("Положили предмет \"" + item + "\" в коробку");
	}

	public void dropItem(String item) {
		if (!isOpen) {
			System.out.println("Нельзя выкинуть предмет из закрытой коробки");
			return;
		}
		if (!this.item.equals(item)) {
			System.out.println("Предмета \"" + item + "\" в коробке нет");
			return;
		}
		this.item = "";
		System.out.println("Выкинули предмет \"" + item + "\" из коробки");
	}
}