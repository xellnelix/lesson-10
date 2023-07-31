package ru.otus.lesson10;

public class Box {
    private final double length;
    private final double height;
    private final double width;
    private String color, item;
    private boolean isFill, isOpen;

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
        color = "Белый";
        isFill = false;
        isOpen = false;
        item = null;
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

    public void setIsFill(boolean isFill) {
        this.isFill = isFill;
    }

    public boolean getIsFill() {
        return isFill;
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
        if (isFill) {
            System.out.println("В коробке есть предмет " + item + "\n");
        } else {
            System.out.println("Коробка пустая\n");
        }
    }

    public void putItem(String item) {
        if (isOpen) {
            if (isFill) {
                System.out.println("В коробке уже есть предмет");
            } else {
                isFill = true;
                this.item = item;
                System.out.println("Положили предмет \"" + item + "\" в коробку");
            }
        } else {
            System.out.println("Нельзя положить предмет в закрытую коробку");
        }
    }

    public void dropItem(String item) {
        if (isOpen) {
            if (isFill) {
                if (this.item.equals(item)) {
                    isFill = false;
                    System.out.println("Выкинули предмет \"" + item + "\" из коробки");
                } else {
                    System.out.println("Предмета \"" + item + "\" в коробке нет");
                }
            } else {
                System.out.println("Нечего выкидывать, коробка уже пустая");
            }
        } else {
            System.out.println("Нельзя выкинуть предмет из закрытой коробки");
        }
    }
}
