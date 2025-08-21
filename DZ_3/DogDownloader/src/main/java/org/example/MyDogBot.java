package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyDogBot extends TelegramLongPollingBot {
        private String botName;
        private String botToken;

    public MyDogBot(String botName, String botToken) {
        this.botToken = botToken;
        this.botName = botName;
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(this);
        } catch (TelegramApiException e) {
            System.out.println("Не получилось зарегестрировать бота");
        }
    }

    @Override
        public void onUpdateReceived(Update update) {
            if (update.hasMessage() && update.getMessage().hasText()) {
                long chatID = update.getMessage().getChatId();
                String text = update.getMessage().getText();
                System.out.println("из чата номер " + chatID + " пришло сообщенте "+text);
                switch (text){
                    case "/start":
                        sendMessage(chatID,"Я бот, который очень любит собак");
                        break;
                    case "/help":
                        sendMessage(chatID, "Введите название породы на aнглийском языке (например bulldog)");
                        break;
                    default:
                        String image = Utils.getDogImage(text);
                        sendMessage(chatID, image);
                }
            }
        }

        void sendMessage(long chatID, String text){
            SendMessage message = new SendMessage();
            message.setChatId(chatID);
            message.setText(text);

            try {
                execute(message);
            } catch (TelegramApiException e){
                System.out.println("Произощола неведомая ошибка");
            }
        }
        @Override
        public String getBotUsername()   {
            // TODO
            return botName;
        }

        @Override
        public String getBotToken() {
            // TODO
            return botToken;
        }
}


