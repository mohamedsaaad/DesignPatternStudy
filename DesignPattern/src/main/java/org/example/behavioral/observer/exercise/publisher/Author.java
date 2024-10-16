package org.example.behavioral.observer.exercise.publisher;

import org.example.behavioral.observer.exercise.Notification;
import org.example.behavioral.observer.exercise.event.BlogPost;
import org.example.behavioral.observer.exercise.event.EventType;
import org.example.behavioral.observer.exercise.event.NewsLetter;
import java.util.ArrayList;

import java.util.List;


public class Author {

    private ObserverManager observerManager;
    private List<NewsLetter> newsletters;
    private List<BlogPost> blogPosts;

    public Author(ObserverManager observerManager) {
        this.observerManager = observerManager;
        this.newsletters = new ArrayList<>();
        this.blogPosts = new ArrayList<>();
    }

    public void addNewsLetter(NewsLetter newsLetter, String message) {
        newsletters.add(newsLetter);
        observerManager.notifySubscribers(EventType.PUBLISH_NEWSLETTER, new Notification(message, EventType.PUBLISH_NEWSLETTER));
    }

    public void addBlogPost(BlogPost blogPost, String message) {
        blogPosts.add(blogPost);
        observerManager.notifySubscribers(EventType.PUBLISH_BLOGPOST, new Notification(message, EventType.PUBLISH_BLOGPOST));
    }
}
