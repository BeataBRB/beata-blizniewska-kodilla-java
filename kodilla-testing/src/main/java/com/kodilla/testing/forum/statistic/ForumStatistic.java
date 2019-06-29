package com.kodilla.testing.forum.statistic;

public class ForumStatistic {

    private int numbersOfUsers;
    private int numbersOfPosts;
    private int numbersOfComments;
    private double  averageNumbersOfPostsPerUser;
    private double  averageNumbersOfCommentsPerUser;
    private double  averageNumberOfCommentsPerPost;



    public int getNumbersOfUsers() {
        return numbersOfUsers;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    public int getNumbersOfComments() {
        return numbersOfComments;
    }

    public double getAverageNumbersOfPostsPerUser() {
        return averageNumbersOfPostsPerUser;
    }

    public double getAverageNumbersOfCommentsPerUser() {
        return averageNumbersOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPos() {
        return averageNumberOfCommentsPerPost;
    }


    public void calculateAdvStatistics(Statistic statistic){
        numbersOfUsers = statistic.userNames().size();
        numbersOfPosts = statistic.postsCount();
        numbersOfComments = statistic.commentsCount();
        averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost();
        averageNumbersOfCommentsPerUser = averageNumbersOfCommentsPerUser();
        averageNumbersOfPostsPerUser = averageNumbersOfPostsPerUser();

    }

    private double averageNumbersOfPostsPerUser(){
        if (numbersOfUsers>0){
            return (double)numbersOfPosts/numbersOfUsers;}
        else{
            return 0;
        }
    }

    private double averageNumberOfCommentsPerPost(){
        if (numbersOfPosts>0){
            return (double)numbersOfComments/numbersOfPosts;}
        else {
            return 0;
        }
    }
    private double averageNumbersOfCommentsPerUser(){
        if(numbersOfUsers>0){
            return (double)numbersOfComments/numbersOfUsers;}
        else {
            return  0;
        }
    }
    public void showStatistics(){
        System.out.println("Numbers of user:" + numbersOfUsers);
        System.out.println("Numbers of posts:" + numbersOfPosts);
        System.out.println("Numbers of comments:" + numbersOfComments);
        System.out.println("Average number of comments per post" + averageNumberOfCommentsPerPost);
        System.out.println("Average number of comments Per user" + averageNumbersOfCommentsPerUser);
        System.out.println("Average number of post per user" + averageNumbersOfPostsPerUser);
    }

}
