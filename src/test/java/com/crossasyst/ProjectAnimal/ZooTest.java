package com.crossasyst.ProjectAnimal;

import org.junit.Test;

public class ZooTest {

    @Test
    public void  shouldFeedAllAnimals(){
Zoo zoo = new Zoo();
Animal[] animals={new Dog() , new Gorilla() , new Tiger() , new Lion() ,};
zoo.feedAnimals(animals);
    }
}
