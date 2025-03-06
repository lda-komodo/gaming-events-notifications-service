package pro.kmdo.gamenotification.domain.model.event;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class AbstractEventMessage {
	final EventMessageType messageType;
	
	public AbstractEventMessage(EventMessageType messageType) {
		this.messageType = messageType;
	}
}
