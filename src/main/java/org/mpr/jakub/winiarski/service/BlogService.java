package org.mpr.jakub.winiarski.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.mpr.jakub.winiarski.domain.Blog;

@Stateless
public class BlogService {
    
    @PersistenceContext(unitName = "jakubw_JPU")
    private EntityManager em;
    
    public List<Blog> getAllBlogs() {
        return em.createQuery("select b from Blog b").getResultList();
    }
    
    public void delete(Blog blog) {
        blog = em.merge(blog);
        em.remove(blog);
    }
 
    public void persist(Blog blog) {
        em.merge(blog);
    }
}
