package pro.kmdo.gamenotification.adapter.kafka;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
@AllArgsConstructor
@ConfigurationProperties(prefix = "pro.kmdo.gamenotification.adapter.kafka.topics")
public class KafkaTopicsConfig {
	
	static final String topicMustMatch = ".*topic$";
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String newFollower;
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String levelUp;
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String itemAcquired;
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String pvp;
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String challengeCompleted;
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String friendRequest;
	
	@NotBlank
	@Pattern(regexp = topicMustMatch)
	private final String friendRequestAccepted;
	
	public String[] getAllTopics() {
		return new String[]{
				newFollower,
				levelUp,
				itemAcquired,
				pvp,
				challengeCompleted,
				friendRequest,
				friendRequestAccepted
		};
	}
	
}
