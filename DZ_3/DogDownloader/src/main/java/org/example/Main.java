package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jfr.Frequency;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        MyDogBot bot1 = new MyDogBot("DogPhoto_bot", "8428584321:AAHQTttwE26mABhT_dFeTlDrnGOWJt8fcns");
        MyDogBot bot2 = new MyDogBot("test_dog2_bot", "8460982841:AAE23F3wlYnHff1G6JPyOaVioU36Exh0Oaw");




//        Scanner sc = new Scanner(System.in);
//        System.out.println("Назваение пароды на английскоим языке");
//        String breed = sc.nextLine();
//
//
//        String url = "https://dog.ceo/api/breed/" + breed + "/images/random";
//
//        CloseableHttpClient client = HttpClients.createDefault();
//        ObjectMapper mapper = new ObjectMapper();
//
//        HttpGet request = new HttpGet(url);
//        CloseableHttpResponse response = client.execute(request);
//
////        Scanner scanner = new Scanner(response.getEntity().getContent());
////        System.out.println(scanner.nextLine());
//
//        Answer answer = mapper.readValue(response.getEntity().getContent(), Answer.class);
////        System.out.println(answer.status);
////        System.out.println(answer.code);
////        System.out.println(answer.message);
//
//        if (answer.status.equals("success")) {
//            String imageUrl = answer.message;
//            String[] splittedAnswer = imageUrl.split("/");
//            String filename = splittedAnswer[splittedAnswer.length - 1];
//
//            request = new HttpGet(imageUrl);
//            CloseableHttpResponse image = client.execute(request);
//
//            FileOutputStream fileOutputStream = new FileOutputStream("images/" + filename);
//            image.getEntity().writeTo(fileOutputStream);
//        }
//        else {
//            System.out.println("Такой породы нет");
//        }
    }
}