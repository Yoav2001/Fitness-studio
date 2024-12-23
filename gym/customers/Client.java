package gym.customers;

import gym.enums.Gender;

import java.util.List;

public class Client extends Person{
    private List<String> notifications;


    public Client(String name , int balance, Gender gender,String birthDate){
        super(name, balance, gender, birthDate);

    }

    public void update(String message) {
        notifications.add(message);
    }

    public List<String> getNotifications() {
        return notifications;
    }



}
