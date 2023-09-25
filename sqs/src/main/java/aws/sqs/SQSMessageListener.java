package aws.sqs;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SQSMessageListener {

    @SqsListener("${application.amazon.sqs.queue-name}")
    public void messageListener(String message) {
        System.out.println("Listener: " + message);
    }
}
