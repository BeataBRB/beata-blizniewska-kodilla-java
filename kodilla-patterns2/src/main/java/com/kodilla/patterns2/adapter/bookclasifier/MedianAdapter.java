package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksMap=
                new HashMap<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book>();
        for(Book myBook: bookSet){
            booksMap.put(new BookSignature(myBook.getSignature()),new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                    myBook.getAuthor(),myBook.getTitle(),myBook.getPublicationYear()));
        }
        return medianPublicationYear(booksMap);
    }
}
