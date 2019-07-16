package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private String name;
    private char sex;
    private LocalDate birthdayDate;
    private int numbersOfPosts;

    public ForumUser(int userId, String name, char sex, LocalDate birthdayDate, int numbersOfPosts) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.numbersOfPosts = numbersOfPosts;
    }


    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", numbersOfPosts=" + numbersOfPosts +
                '}';
    }
}