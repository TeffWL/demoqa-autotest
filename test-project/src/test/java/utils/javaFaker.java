package utils;

import com.github.javafaker.Faker;

public class javaFaker {

    Faker faker = new Faker();

    String userName = faker.name().firstName();
}
