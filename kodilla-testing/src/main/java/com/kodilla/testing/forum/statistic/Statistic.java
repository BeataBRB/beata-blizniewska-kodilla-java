package com.kodilla.testing.forum.statistic;

import  java.util.List;

public interface Statistic {
    List<String> userNames();
    int postsCount();
    int commentsCount();
}
