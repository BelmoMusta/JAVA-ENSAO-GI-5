package com.ensao.java.advanced.types;

import java.lang.reflect.Field;
@SuppressWarnings("all")


@interface IsLowerCase {

}

@SuppressWarnings("all")

record Person(@IsLowerCase String name, String adress) {


}
@SuppressWarnings("all")


class RecordUsage {
	public static void main(String[] args) {
		Person person = new Person("a", "b");
		System.out.println(person.name());
		System.out.println(person.adress());
		Person copy = new Person(person.name(), person.adress());
		System.out.println(person.equals(copy));
	}
}
@SuppressWarnings("all")

public class ReflectionExample {
	public static boolean isPersonValid(Person person) throws Exception {
		Field[] declaredFields = Person.class.getDeclaredFields();
		for (Field declaredField : declaredFields) {
			declaredField.setAccessible(true);
			IsLowerCase isLowerCase = declaredField.getAnnotation(IsLowerCase.class);
			if (isLowerCase != null) {
				String fieldValue = (String) declaredField.get(person);
				if (!fieldValue.equals(fieldValue.toLowerCase())) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		Person person = new Person("Karim", "Oujda");
		boolean isPersonValid = isPersonValid(person);
		System.out.println(isPersonValid); // false
	}
	
}
