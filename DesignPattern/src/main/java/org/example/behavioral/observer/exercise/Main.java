package org.example.behavioral.observer.exercise;

import org.example.behavioral.observer.exercise.event.BlogPost;
import org.example.behavioral.observer.exercise.event.EventType;
import org.example.behavioral.observer.exercise.event.NewsLetter;
import org.example.behavioral.observer.exercise.publisher.Author;
import org.example.behavioral.observer.exercise.publisher.ObserverManager;
import org.example.behavioral.observer.exercise.subscriber.Readers;

public class Main {
    public static void main(String[] args) {
        ObserverManager observerManager = new ObserverManager();
        Author author = new Author(observerManager);

        Readers soliman = new Readers("SOLIMAN");
        Readers ezzat = new Readers("EZZAT");
        Readers amr = new Readers("AMR");
        Readers halemo = new Readers("HALEMO");

        observerManager.subscribe(EventType.PUBLISH_NEWSLETTER, soliman);
        observerManager.subscribe(EventType.PUBLISH_BLOGPOST, amr);
        observerManager.subscribe(EventType.PUBLISH_BLOGPOST, ezzat);
        observerManager.subscribe(EventType.PUBLISH_NEWSLETTER, halemo);

        author.addBlogPost(new BlogPost("Spring Security", "Spring Security in action"), "Blog Post: Master Spring Security");

        observerManager.unsubscribe(EventType.PUBLISH_BLOGPOST, amr);

        author.addBlogPost(new BlogPost("Ruby on Rails", "Ruby on Rails in action"), "Blog Post: Master Ruby on Rails");

        author.addNewsLetter(new NewsLetter("Node.js", "Node.js in action"), "NewsLetter: Master Node.js");
    }
}
