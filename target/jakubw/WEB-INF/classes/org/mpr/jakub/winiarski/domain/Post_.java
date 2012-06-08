package org.mpr.jakub.winiarski.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.mpr.jakub.winiarski.domain.Blog;
import org.mpr.jakub.winiarski.domain.Comment;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-08T14:09:50")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, Long> id;
    public static volatile SingularAttribute<Post, String> content;
    public static volatile SingularAttribute<Post, String> author;
    public static volatile SingularAttribute<Post, String> subject;
    public static volatile SingularAttribute<Post, Blog> blog;
    public static volatile ListAttribute<Post, Comment> comments;

}