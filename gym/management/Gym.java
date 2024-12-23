package gym.management;

import gym.customers.Person;

public class Gym {

    private String name;
    private  Secretary secretary;
    private int balance;

    private static Gym onlyInstance = null;

    private  Gym() {};

    public static Gym getInstance(){
        if (onlyInstance == null)
            onlyInstance = new Gym();

        return  onlyInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecretary(Person secretary, int salary) {

        this.secretary = secretary;
    }

}

