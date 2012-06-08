package org.mpr.jakub.winiarski.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.mpr.jakub.winiarski.domain.Post;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-08T14:09:50")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Long> id;
    public static volatile SingularAttribute<Comment, String> content;
    public static volatile SingularAttribute<Comment, String> author;
    public static volatile SingularAttribute<Comment, Post> post;

}