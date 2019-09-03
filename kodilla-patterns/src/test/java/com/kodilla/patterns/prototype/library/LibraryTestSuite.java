package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws Exception {

        //Given
        Library library = new Library("List of the most popular book of detective stories");
        Book book1 = new Book("Wyrok. Joanna Chyłka.", "Remigiusz Mróz", LocalDate.of(2019, 01, 1));
        Book book2 = new Book("Millennium. Ta, która musi umrzeć", "David lagercrantz", LocalDate.of(2019, 12, 2));
        Book book3 = new Book("Pacjentka", "Alex Michaelides", LocalDate.of(2019, 11, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;

        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("List of the most popular book of crime book stories");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("List of the most popular of thriller book");


        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
