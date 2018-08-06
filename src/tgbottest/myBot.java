package tgbottest;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class myBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {

        return "PVV97Bot_bot";
    }

    @Override
    public String getBotToken() {

        return "640047738:AAHBmMm-CqE83m5tPxX5WUgsjGN44IelLQw";

    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage();
            message.setChatId(chat_id);

            if (text.equals("/help")) {
                message.setText("dinax");
            } else {
                message.setText(text);

            }

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

}
