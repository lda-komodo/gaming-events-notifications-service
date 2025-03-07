package pro.kmdo.gamenotification.domain.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.UUID;

@NoArgsConstructor
@AllArgsConstructor()
@ToString
public class BaseGamingEvent<T> {
	
	@UUID(allowNil = false, version = 4, letterCase = UUID.LetterCase.INSENSITIVE)
	@JsonProperty
	@Getter
	String messageId;
	
	@Email
	@JsonProperty
	@Getter
	String userId;
	
	@Positive
	@JsonProperty
	@Getter
	long timestamp;
	
	@Valid
	@JsonProperty
	@Getter
	T eventMessage;
}
