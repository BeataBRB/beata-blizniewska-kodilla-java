package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser->Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getNumbersOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);



        //        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);




//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);





    //    People.getList().stream()
      //          .map(String::toUpperCase)
        //        .filter(s -> s.length()>11)
          //      .map(s -> s.substring(0, s.indexOf(' ')+2)+ ".")
            //    .filter(s -> s.substring(0,1).equals("M"))
              //  .forEach(System.out::println);



       // System.out.println("Welcome to module 7 - Strem");
       // ExpressionExecutor expressionExecutor = new ExpressionExecutor();

       // System.out.println("Calculating expressions with lambdas");
        // expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        //expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
       // expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
       // expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));

        //System.out.println("Calculating expressions with method reference");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBfromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //PoemBeautifier poemBeautifier = new PoemBeautifier();
        //String beautifulText = poemBeautifier.beautify("beautiful text", (text -> text.toUpperCase()));
        //System.out.println(beautifulText);

        //String beautifulText2 = poemBeautifier.beautify("beautiful text", (text -> "ABC" + text + "ABC"));
        //System.out.println(beautifulText2);

        //String beautifulText3 = poemBeautifier.beautify("beautiful text", (text -> text.replace(" ", "*")));
        //System.out.println(beautifulText3);



        //System.out.println("Using Strem to generate even numbers even number form 1 to 20");
        //NumbersGenerator.generateEven(20);
    }
}
