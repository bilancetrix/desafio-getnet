package com.getnet.factory;

import com.getnet.domain.User;
import com.getnet.domain.UserBuilder;
import net.datafaker.Faker;

public class UserFactory {

    private static final Faker faker = new Faker();

    public static User createFakeUser(){
        return new UserBuilder()
                .setJob(faker.options().option("QA", "Developer", "PM", "Srum Master"))
                .setName(faker.breakingBad().character())
                .build();
    }

    public static User createUserWithoutName(){
        return new UserBuilder()
                .setJob(faker.options().option("QA", "Developer", "PM", "Srum Master"))
                .build();
    }

    public static User createUserWithoutJob(){
        return new UserBuilder()
                .setName(faker.breakingBad().character())
                .build();
    }

}
