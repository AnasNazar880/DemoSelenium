package org.obs.utility;

import com.github.javafaker.Faker;

public class RandomData1 {
    public static Faker faker;
    public static String getFirstName(){
        faker=new Faker();
        String firstName1 =faker.name().firstName();
        return firstName1;
    }
    public static String getLastName(){
        faker=new Faker();
        String lastName=faker.name().lastName();
        return lastName;
    }
    public static String getMobileNumber(){
        faker=new Faker();
        String mobileNumber=faker.phoneNumber().phoneNumber();
        return mobileNumber;
    }
    public static String getCity(){
        faker=new Faker();
        String city=faker.address().city();
        return city;
    }
    public static String getCountry(){
        faker=new Faker();
        String country=faker.address().country();
        return country;
    }
    public  static String getPinCode(){
        faker=new Faker();
        String pinCode=faker.address().zipCode();
        return pinCode;
    }
    public static String getState(){
        faker=new Faker();
        String state=faker.address().state();
        return state;
    }
    public static String getEmail(){
        faker=new Faker();
        String email=faker.internet().emailAddress();
        return email;
    }
    public static String getPassWord(){
        faker=new Faker();
        String passWord=faker.internet().password();
        return passWord;
    }

}
