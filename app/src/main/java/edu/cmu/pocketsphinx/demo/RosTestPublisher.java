package edu.cmu.pocketsphinx.demo;

import org.ros.namespace.GraphName;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.PublisherListener;

import java.util.concurrent.TimeUnit;

public class RosTestPublisher implements Publisher {
    @Override
    public void setLatchMode(boolean b) {

    }

    @Override
    public boolean getLatchMode() {
        return false;
    }

    @Override
    public Object newMessage() {
        return null;
    }

    @Override
    public void publish(Object o) {

    }

    @Override
    public boolean hasSubscribers() {
        return false;
    }

    @Override
    public int getNumberOfSubscribers() {
        return 0;
    }

    @Override
    public void shutdown(long l, TimeUnit timeUnit) {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void addListener(PublisherListener publisherListener) {

    }

    @Override
    public GraphName getTopicName() {
        return null;
    }

    @Override
    public String getTopicMessageType() {
        return null;
    }
}
