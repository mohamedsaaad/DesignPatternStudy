package org.example.behavioral.observer.exercise.publisher;

import org.example.behavioral.observer.exercise.event.BlogPost;
import org.example.behavioral.observer.exercise.event.EventType;
import org.example.behavioral.observer.exercise.event.NewsLetter;
import org.example.behavioral.observer.exercise.subscriber.Readers;
import org.example.behavioral.observer.exercise.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {

    Map<EventType,List<Subscriber>> readers;
    List<NewsLetter> newsLetters;
    List<BlogPost> blogPosts;

    public Author() {
        this.readers=new HashMap<>();
        initiateEvent();
        this.newsLetters =new ArrayList<>();
        this.blogPosts =new ArrayList<>();
    }

    private void initiateEvent() {
        readers.put(EventType.PUBLISH_BLOGPOST,new ArrayList<>());
        readers.put(EventType.PUBLISH_NEWSLETTER,new ArrayList<>());
    }

    public void addNewsLetter(NewsLetter newsLetter,String message){
        newsLetters.add(newsLetter);
        notifyReader(EventType.PUBLISH_NEWSLETTER,message);
    }

    public void addBlogPost(BlogPost blogPost,String message){
        blogPosts.add(blogPost);
        notifyReader(EventType.PUBLISH_BLOGPOST,message);
    }
    private void notifyReader(EventType eventType, String message) {
        readers.get(eventType).forEach(newsLetterReader ->{
            newsLetterReader.notify(message);
        });
    }

    public void subscribe(EventType eventType,Subscriber subscriber){
        readers.get(eventType).add(subscriber);
    }

    public void unSubscribe(EventType eventType,Subscriber subscriber){
        readers.get(eventType).remove(subscriber);
    }
}
