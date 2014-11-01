package com.test.filterstrategy;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}

	public List<Animal> getCats() {
		return filterBySpecification(new CatSpecification());
	}

	private interface Specification {
		boolean isSatisfiedBy(Animal animal);
	}

	public List<Animal> getDogs() {
		return filterBySpecification(new DogSpecification());
	}

	public List<Animal> filterBySpecification(Specification specification) {
		List<Animal> list = new ArrayList<Animal>();
		for (Animal animal : getAnimals()) {
			if (specification.isSatisfiedBy(animal)) {
				list.add(animal);
			}
		}
		return list;
	}

	private class DogSpecification implements Specification {
		@Override
		public boolean isSatisfiedBy(Animal animal) {
			if (animal.getType().equals("DOG")) {
				return true;
			}
			return false;
		}
	}

	private class CatSpecification implements Specification {
		@Override
		public boolean isSatisfiedBy(Animal animal) {
			if (animal.getType().equals("CAT")) {
				return true;
			}
			return false;
		}
	}
}
