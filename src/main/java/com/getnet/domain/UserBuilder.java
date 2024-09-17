package com.getnet.domain;

import lombok.Builder;


public class UserBuilder {

    private String name;
    private String job;

    public UserBuilder setJob(String job) {
        this.job = job;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public User build(){
        return new User(name, job);
    }


}
