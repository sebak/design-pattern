package com.pw.designpattern.observer;

public interface Subject {

    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);

    void notifyAllSubscribers(YoutubeEvent event);
}
