package pro.kmdo.gamenotification.domain.model.notification;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {
	@NotNull
	String id;
	@NotNull
	String userId;
	@NotNull
	String title;
	@NotNull
	String body;
	
	static Notification fromEvent(@NonNull BaseGamingEvent<?> gameEvent) {
		return Notification.builder()
				.id(gameEvent.getMessageId())
				.userId(gameEvent.getUserId())
				.title("") //TODO: Messages templates
				.body("")  //TODO: message tampleates
				.build();
	}
}
