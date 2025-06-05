package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

    Faker faker = new Faker(new Locale("en"));

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = faker.options().option("Other", "Female", "Male");
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    public String birthDay = String.valueOf(faker.number().numberBetween(1, 28));
    public String birthMonth = faker.options().option(
                    "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December");
    public String birthYear = String.valueOf(faker.number().numberBetween(1970, 2006));
    public String dateOfBirth = birthDay + " " + birthMonth + "," + birthYear;
    public String subjects = faker.options().option(
                    "Maths", "Chemistry", "English", "Physics", "Computer Science", "Economics",
                            "Arts");
    public String hobbies = faker.options().option("Sports", "Reading", "Music");
    public String uploadImage = "cat.jpg";
    public String currentAddress = faker.address().fullAddress();
    public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public String city = getCity(state);

public String getCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> "";
        };
    }


    }