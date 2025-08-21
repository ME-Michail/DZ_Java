package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.classic.methods.HttpGet;

import javax.imageio.IIOException;
import java.io.IOException;

public class Utils {
    public static String getDogImage(String breed) {
        String url = "https://dog.ceo/api/breed/" + breed + "/images/random";
        CloseableHttpClient client = HttpClients.createDefault();
        ObjectMapper mapper = new ObjectMapper();

        try {
            HttpGet request = new HttpGet(url);
            CloseableHttpResponse response = client.execute(request);

            Answer answer = mapper.readValue(response.getEntity().getContent(), Answer.class);


            if (answer.status.equals("success")) {
                String imageUrl = answer.message;
                return imageUrl;

            }
            else {
                return "Такой породы не найдено";
            }

        } catch (IOException e) {
            return ("Сервер с собачкамии не отвечвает");
        }



    }
}
