/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2animal;

/**
 *
 * @author ThinkPad
 */
public class Processor {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();

        Animal dog1 = new Animal("111", "Vietnam", "1212", "fdsdsd", "Dog");
        Animal dog2 = new Animal("222", "USA", "1313", "red", "Dog");

        Animal cat1 = new Animal("333", "UK", "4343", "White", "Cat");
        Animal cat2 = new Animal("444", "Japan", "5454", "Gray", "Cat");

        animalList.addAnimal(dog1);
        animalList.addAnimal(dog2);
        animalList.addAnimal(cat1);
        animalList.addAnimal(cat2);

        animalList.displayAll();
    }
}


