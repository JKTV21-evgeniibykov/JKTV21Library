/*
 * Copyright (C) 2022 pupil
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package managers;

import entity.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class BaseManager {

    public void saveBooks(Book[] books) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JKTV21LibraryPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        for (int i=0; i<books.length; i++) {
            if (books[i].getId() == null) {
                em.persist(books[i]);
                for (int j=0; j<books[i].getAuthors().length; j++) {
                    em.persist(books[i].getAuthors()[j]);
                }
                break;
            }
        }
        tx.commit();
    }
    
}
