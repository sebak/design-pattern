package com.pw.designpattern.observer;

public interface Observer {

    // Observer need to be notified on kind of Event
    void notifyMe(String youtubeChannelName, YoutubeEvent event);
}
