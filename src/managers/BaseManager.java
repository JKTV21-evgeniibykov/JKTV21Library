package managers;

import entity.Author;
import entity.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BaseManager {

//    public void saveBooks(Book[] books) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        for (int i=0; i<books.length; i++) {
//            if (books[i].getId() == null) {
//                em.persist(books[i]);
//                for (int j=0; j<books[i].getAuthors().length; j++) {
//                    em.persist(books[i].getAuthors()[j]);
//                }
//                break;
//            }
//        }
//        tx.commit();
//    }
//    
//    public void saveAuthors(Author[] authors) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        for (int i=0; i<authors.length; i++) {
//            if (authors[i].getId() == null) {
//                em.persist(authors[i]);
//                break;
//            }
//        }
//        tx.commit();
//    }
    
    public Author[] loadAuthors() {
        Author[] authors = new Author[0];
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        tx.commit();        return null;
    }

}
