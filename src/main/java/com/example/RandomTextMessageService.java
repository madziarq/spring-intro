package com.example;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@Component("messageService")
public class RandomTextMessageService implements MessageService {
    List<String> messages = new ArrayList<String>();
    {
        messages.add("Hello World");
        messages.add("Politechnika");
        messages.add("Krakowska");
        messages.add("Ala ma kota");
        messages.add("Kot ma Ale");
        messages.add("Adam ma psa");
        messages.add("Pies ma Adama");
        messages.add("Technologie Obiektowe");
        messages.add("Wiadomość");
        messages.add("Houston, mamy problem");
    }
    Random rand = new Random();

    @Override
    public String getMessage() {
        int randomIndex = rand.nextInt(messages.size());
        return messages.get(randomIndex);
    }
}
