package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Beata", 'F', LocalDate.of(1988, Month.FEBRUARY, 16),12));
        forumUserList.add(new ForumUser(2, "Patryk", 'M', LocalDate.of(1990, Month.FEBRUARY, 18),30));
        forumUserList.add(new ForumUser(3, "Borys", 'M', LocalDate.of(2017, Month.NOVEMBER, 16),0));
        forumUserList.add(new ForumUser(4, "Karolina", 'F', LocalDate.of(1990, Month.APRIL, 20),5));
        forumUserList.add(new ForumUser(5, "Justyna", 'F', LocalDate.of(1988, Month.DECEMBER, 14),7));

    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}