package com.example;

public class PersonService {

    private PersonProperties personProperties;

    public PersonService() {

    }

    public PersonService(PersonProperties personProperties) {
        this.personProperties = personProperties;
    }

    public void sayHello(){
        System.out.println("大家好，我叫: " + personProperties.getName() + ", 今年" + personProperties.getAge() + "岁"
                + ", 性别: " + personProperties.getSex());
    }

}




