package tgbottest;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class TgBotTest {

    public static void main(String[] args) {
        //инициализируем API
        ApiContextInitializer.init();
        
        TelegramBotsApi botsApi =  new TelegramBotsApi();
        
        try{
            botsApi.registerBot(new myBot());
        }catch(TelegramApiException e){
            e.printStackTrace();
        }
        
    }
    
}
