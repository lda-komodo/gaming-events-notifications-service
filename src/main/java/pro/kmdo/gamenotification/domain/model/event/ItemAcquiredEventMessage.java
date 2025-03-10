package pro.kmdo.gamenotification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.ToString;

@ToString(callSuper = true)
public class ItemAcquiredEventMessage extends AbstractEventMessage {
    
    @NotNull
    @NotEmpty
    @NotBlank
    @JsonProperty
    String itemName;
    
    public ItemAcquiredEventMessage() {
        super(EventMessageType.ITEM_ACQUIRED);
    }
	
}
