package com.TexasAerialRobotics.Mission8_TARApp;

import android.util.Log;

import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;

public class RosPublisher extends AbstractNodeMain {

    private static Publisher<std_msgs.String> publisher;

    RosPublisher() {
    }

    @Override
    public GraphName getDefaultNodeName() {
        return GraphName.of("TARApp/Publisher");
    }

    @Override
    public void onStart(final ConnectedNode connectedNode) {
        publisher = connectedNode.newPublisher("Android", std_msgs.String._TYPE);
    }

    static void publish(String message) {
        try {
            std_msgs.String toPublish = publisher.newMessage();
            toPublish.setData(message);
            publisher.publish(toPublish);
        }
        catch (NullPointerException ignored) {
            Log.i("Failure","Failed to publish");
        }
    }
}
