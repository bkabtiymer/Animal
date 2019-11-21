package com.company;

public class Dog extends Animal {

        private String description;
        private int age;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void speakAnimal(){
        System.out.println("He barks but dont bite");
    }
}
