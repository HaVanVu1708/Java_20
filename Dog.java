package Java_20;

import Java_20.Animal;

public class Dog extends Animal {
    @Override
    public void greeting(){
        System.out.println("Woof!");
    }

    public void greeting(Dog another){
        System.out.println("Wooooooooof!");
    }
}
