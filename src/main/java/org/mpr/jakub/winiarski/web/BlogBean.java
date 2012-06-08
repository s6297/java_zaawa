package org.mpr.jakub.winiarski.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.mpr.jakub.winiarski.domain.Blog;
import org.mpr.jakub.winiarski.service.BlogService;

@SessionScoped
@Named("blogBean")
public class BlogBean implements Serializable {

    private static final long serialVersionUID = 16564L;
    
    private ListDataModel<Blog> blogs = new ListDataModel<Blog>();
    private Blog blog;
    
    @Inject
    private BlogService blogService;

    public ListDataModel<Blog> getAllBlogs() {
        blogs.setWrappedData(blogService.getAllBlogs());
        return blogs;
    }
    
    public String addBlog() {
        blog = new Blog();
        return "addBlog";
    }
            
    public Blog getSelectedBlog() {
        return blogs.getRowData();
    }

    public String deleteBlog() {
        Blog selectedBlog = blogs.getRowData();
        blogService.delete(selectedBlog);
        return "listBlogs";
    }

    public String editBlog() {
        blog = blogs.getRowData();
        return "editBlog";
    }

    public String updateBlog() {
        blogService.persist(blog);
        return "listBlogs";
    }
    
    public String showBlog() {
        blog = blogs.getRowData();
        return "showBlog";
    }

    public Blog getBlog() {
        if(blog == null) { 
            blog = new Blog(); 
        }
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
