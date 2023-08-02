package ru.otus.lesson10;

public class Main {
	public static void main(String[] args) {
		User[] users = {
				new User("Иванов", "Иван", "Иванович", 1971, "iiivanovich@gmail.com"),
				new User("Петров", "Петр", "Петрович", 2001, "pppetrovich@gmail.com"),
				new User("Смирнова", "Алена", "Генадьевна", 2008, "sagandievna@mail.ru"),
				new User("Васильчук", "Юлия", "Евгеньевна", 1973, "vuevgenievna@mail.ru"),
				new User("Тестов", "Тест", "Тестович", 1965, "tttestovich@yandex.ru")
		};
		for (int i = 0; i < users.length; i++) {
			if (2023 - users[i].getBirthYear() > 40) {
				users[i].getUserInfo();
			}
		}
	}
}
