package gym.customers;
import gym.enums.Gender;

public class Person {
    private static int nextId = 1;


    private int id;
    private String name;
    private int balance;
    private Gender gender;
    private String birthDate;

    //constrctor
    public Person(String name,int balance,Gender gender,String birthDate){
        id= nextId++;
        this.name = name;
        this.balance = balance;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }


    public float getBalance() {
        return balance;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
