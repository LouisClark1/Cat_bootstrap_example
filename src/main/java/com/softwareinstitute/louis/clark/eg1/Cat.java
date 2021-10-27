package com.softwareinstitute.louis.clark.eg1;

public class Cat {
    private String name;
    private int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(){
        this.breed = breed;
    }



    public String getJsonObjectCat() {
        return "{" +

                "\"name\"= \"" + name +

                "\", \"age\"=\"" + age +

                "\", \"breed\"=\"" + breed +

                "\"}";
    }


}
