package com.pw.designpattern.observer;

public class YoutubeEvent {
    private EventType eventType;
    private String topic;

    public YoutubeEvent(EventType eventType, String topic) {
        this.eventType = eventType;
        this.topic = topic;
    }

    // getters ans setters

    @Override
    public String toString() {
        return eventType.name() + " on " +  topic;
    }
}