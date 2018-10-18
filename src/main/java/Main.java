import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;

public class Main {
	public static void main(String[] args) {
            // Se inicializa el contexto de la API
            ApiContextInitializer.init();
            // Se crea un nuevo Bot API
            final TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

            try {
                // Se registra el bot
                telegramBotsApi.registerBot((LongPollingBot) new EchoBot());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
	}
}