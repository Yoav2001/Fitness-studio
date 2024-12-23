package gym.customers;

import gym.enums.Gender;
import gym.management.Sessions.Session;

import java.util.List;

public class Instructor extends Person{
    private int hourlyWage;
    private List<SessionType> certifiedSessions;


    public Instructor(String name , int balance , Gender gender, String birthDate, List<SessionType> certifiedSessions){
        super(name, balance, gender, birthDate);
        this.certifiedSessions = certifiedSessions;
    }


}
