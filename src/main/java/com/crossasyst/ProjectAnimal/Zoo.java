package com.crossasyst.ProjectAnimal;

public class Zoo  {
    public void feedAnimals(Animal[] animals){
        for (Animal animal:animals)
        {
            animal.eat();
            animal.age();
        }
    }
}
