package com.kodilla.testing.forum.statistic;

import org.junit.*;


import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;


public class ForumStatisticTest {

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    private Statistic statisticMock;
    private ForumStatistic forumStatistic;

    @Before
    public void before() {
        statisticMock = mock(Statistic.class);
        List<String> staticList = new ArrayList<>();
        staticList.add("Adam");
        staticList.add("Tomek");
        staticList.add("Agata");
        staticList.add("Ania");
        staticList.add("Paulina");

        when(statisticMock.userNames()).thenReturn(staticList);
        when(statisticMock.postsCount()).thenReturn(50);
        when(statisticMock.commentsCount()).thenReturn(80);
        forumStatistic = new ForumStatistic();


    }

    @Test
    public void testCalculateAdvStatisticsWhenTheNumberOfPostsIsZero() {

        when(statisticMock.postsCount()).thenReturn(0);


        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(0, forumStatistic.getNumbersOfPosts());
        assertEquals(0, forumStatistic.getAverageNumbersOfPostsPerUser(), 0.01);
        assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPos(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsThenNumnerOfPostsIsThousand(){
        when(statisticMock.postsCount()).thenReturn(1000);

        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(1000, forumStatistic.getNumbersOfPosts());
        assertEquals(200, forumStatistic.getAverageNumbersOfPostsPerUser(), 0.01);
        assertEquals(0.08, forumStatistic.getAverageNumberOfCommentsPerPos(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsThenNumberOfCommentsIsZero(){
        when(statisticMock.commentsCount()).thenReturn(0);

        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(0, forumStatistic.getNumbersOfComments());
        assertEquals(0, forumStatistic.getAverageNumbersOfCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistic.getAverageNumberOfCommentsPerPos(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsThenTheCommentsIsLessThatPosts(){
        when(statisticMock.commentsCount()).thenReturn(5);
        when(statisticMock.postsCount()).thenReturn(25);

        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(25, forumStatistic.getNumbersOfPosts());
        assertEquals(5, forumStatistic.getNumbersOfComments());

        assertEquals(5, forumStatistic.getAverageNumbersOfPostsPerUser(), 0.01);
        assertEquals(1, forumStatistic.getAverageNumbersOfCommentsPerUser(), 0.01);
        assertEquals(0.2, forumStatistic.getAverageNumberOfCommentsPerPos(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsThenTheCommentsIsMoreThatPosts(){

        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(50, forumStatistic.getNumbersOfPosts());
        assertEquals(80, forumStatistic.getNumbersOfComments());

        assertEquals(10, forumStatistic.getAverageNumbersOfPostsPerUser(), 0.01);
        assertEquals(16, forumStatistic.getAverageNumbersOfCommentsPerUser(), 0.01);
        assertEquals(1.6, forumStatistic.getAverageNumberOfCommentsPerPos(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsThenTheUserIsZero(){
        List<String>listMock = new ArrayList<>();
        when(statisticMock.userNames()).thenReturn(listMock);

        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(0, forumStatistic.getNumbersOfUsers());
        assertEquals(0, forumStatistic.getAverageNumbersOfPostsPerUser(), 0.01);
        assertEquals(0, forumStatistic.getAverageNumbersOfCommentsPerUser(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsThenTheUserIsHundred(){
        List<String>listMock = new ArrayList<>();
        for(int n=0; n<100; n++){
            listMock.add("User");
        }
        when(statisticMock.userNames()).thenReturn(listMock);

        forumStatistic.calculateAdvStatistics(statisticMock);

        assertEquals(100, forumStatistic.getNumbersOfUsers());
        assertEquals(0.5, forumStatistic.getAverageNumbersOfPostsPerUser(), 0.01);
        assertEquals(0.8, forumStatistic.getAverageNumbersOfCommentsPerUser(), 0.01);

    }
}