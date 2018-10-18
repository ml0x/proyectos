import java.io.File;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendPhoto;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class EchoBot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(final Update update) {
		// Esta función se invocará cuando nuestro bot reciba un mensaje

		// Se obtiene el mensaje escrito por el usuario
		final String messageTextReceived = update.getMessage().getText();
		// Se obtiene el id de chat del usuario
		final long chatId = update.getMessage().getChatId();
		// Se crea un objeto mensaje
		SendMessage message = new SendMessage().setChatId(chatId).setText(messageTextReceived);
		
                /*SendPhoto sendPhoto = new SendPhoto();
                //sendPhoto.setCaption("My Caption!");
                sendPhoto.setNewPhoto(new File("C:\\Users\\Goplicity\\Documents\\NetBeansProjects\\bot_telegram\\src\\main\\java\\1.jpg"));
                //sendPhoto.setChatId("@test_channel");
                
               // SendPhoto photo = new SendPhoto().setChatId(chatId).setPhoto("1.jpg");*/
                
		try {
                   
                  execute(message);
                   // sendPhoto(sendPhoto);
		} catch (TelegramApiException e) {
                    e.printStackTrace();
		}
	}

	@Override
	public String getBotUsername() {
		// Se devuelve el nombre que dimos al bot al crearlo con el BotFather
		return "Trapito";
	}

	@Override
	public String getBotToken() {
		// Se devuelve el token que nos generó el BotFather de nuestro bot
		return "635216579:AAHu2Mo3Iu9DOHAkyL7AG2dvl3zPGXqFZB4";
	}

    private void execute(SendPhoto photo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
