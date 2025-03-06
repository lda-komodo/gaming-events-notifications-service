package pro.kmdo.gamenotification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
public class PvPEventMessage extends AbstractEventMessage {
	
	@Email
	@JsonProperty
	@Getter
	String vsUserId;
	
	public PvPEventMessage() {
		super(EventMessageType.PVP);
	}
}
