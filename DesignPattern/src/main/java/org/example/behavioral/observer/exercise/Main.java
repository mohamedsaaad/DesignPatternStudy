package org.example.behavioral.observer.exercise;

import org.example.behavioral.observer.exercise.event.BlogPost;
import org.example.behavioral.observer.exercise.event.EventType;
import org.example.behavioral.observer.exercise.event.NewsLetter;
import org.example.behavioral.observer.exercise.publisher.Author;
import org.example.behavioral.observer.exercise.subscriber.Readers;

public class Main {
    public static void main(String[] args) {
        Author author=new Author();
        Readers soliman=new Readers("SOLIMAN");
        Readers ezzat=new Readers("EZZAT");
        Readers amr=new Readers("AMR");
        Readers halemo=new Readers("HALEMO");

        author.subscribe(EventType.PUBLISH_NEWSLETTER,soliman);
        author.subscribe(EventType.PUBLISH_BLOGPOST,amr);
        author.subscribe(EventType.PUBLISH_BLOGPOST,ezzat);
        author.subscribe(EventType.PUBLISH_NEWSLETTER,halemo);

        author.addBlogPost(new BlogPost("Spring Security","Spring Security in action")
        ,"Blog Post Master Spring security");

        author.unSubscribe(EventType.PUBLISH_BLOGPOST,amr);

        author.addBlogPost(new BlogPost("Ruby on rails","Ruby on rails in action")
                ,"Blog Post Master Ruby on rails");

        author.addNewsLetter(new NewsLetter("Node.js","Node.js in action")
                ,"NewsLetter Master Node.js");
    }
}
