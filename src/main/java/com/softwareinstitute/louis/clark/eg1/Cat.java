package com.softwareinstitute.louis.clark.eg1;

public class Cat {
    private String name;
    private int age;
    private String Characteristic;

    public Cat(String name, int age, String Characteristic) {
        this.name = name;
        this.age = age;
        this.Characteristic = Characteristic;
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

    public String getCharacteristic(){
        return Characteristic;
    }
    public void setCharacteristic(){
        this.Characteristic = Characteristic;
    }



    public String getJsonObjectCat() {
        return "{" +

                "\"name\": \"" + name +

                "\", \"age\":\"" + age +

                "\", \"breed\":\"" + Characteristic +

                "\"}";
    }


}
