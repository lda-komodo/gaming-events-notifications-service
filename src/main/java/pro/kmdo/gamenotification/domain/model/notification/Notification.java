package pro.kmdo.gamenotification.domain.model.notification;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Notification {
	
	@NotNull
	String id;
	
	@NotNull
	String userId;
	
	@NotNull
	String title;
	
	@NotNull
	String body;
}
