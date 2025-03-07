package pro.kmdo.gamenotification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.ToString;

@ToString(callSuper = true)
public class ChallengeCompletedEventMessage extends AbstractEventMessage {
	
	@NotNull
	@NotEmpty
	@NotBlank
	@JsonProperty
	String challengeName;
	
	public ChallengeCompletedEventMessage() {
		super(EventMessageType.CHALLENGE_COMPLETED);
	}
	
}