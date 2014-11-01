package com.test.filterstrategy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		Cat cat = new Cat();
		cat.setType("CAT");
		cat.setMauSound("mauSound");

		Dog dog = new Dog();
		dog.setType("DOG");
		dog.setBarkSound("barkSound");

		zoo.addAnimal(dog);
		zoo.addAnimal(cat);

		System.out.println(zoo.getCats().get(0).getType());
		System.out.println(zoo.getDogs().get(0).getType());
	}

}
