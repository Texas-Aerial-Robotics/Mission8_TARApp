package edu.cmu.pocketsphinx.demo;

import org.ros.message.MessageListener;
import org.ros.namespace.GraphName;
import org.ros.node.topic.Subscriber;
import org.ros.node.topic.SubscriberListener;

import java.util.concurrent.TimeUnit;


public class RosSubscriber implements Subscriber {

    @Override
    public void addMessageListener(MessageListener messageListener, int i) {

    }

    @Override
    public void addMessageListener(MessageListener messageListener) {

    }

    @Override
    public boolean removeMessageListener(MessageListener messageListener) {
        return false;
    }

    @Override
    public void removeAllMessageListeners() {

    }

    @Override
    public void shutdown(long l, TimeUnit timeUnit) {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void addSubscriberListener(SubscriberListener subscriberListener) {

    }

    @Override
    public boolean getLatchMode() {
        return false;
    }

    @Override
    public GraphName getTopicName() {
        return null;
    }

    @Override
    public java.lang.String getTopicMessageType() {
        return null;
    }
}
