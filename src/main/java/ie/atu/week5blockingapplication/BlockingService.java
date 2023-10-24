package ie.atu.week5blockingapplication;

import org.springframework.stereotype.Service;

@Service
public class BlockingService {
    private final RestTemplate restTemplate;

    public BlockingService(RestTemplate restTemplate) { this.restTemplate = restTemplate; }

    public String fetchDataBlocking() {
        // Simulate a delay of two seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", Spring.class);
    }
}
