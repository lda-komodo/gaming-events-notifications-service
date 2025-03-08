package pro.kmdo.gamenotification.adapter.kafka;

import lombok.AllArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.LevelUpEventMessage;
import reactor.kafka.receiver.ReceiverOptions;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableConfigurationProperties(KafkaTopicsConfig.class)
@AllArgsConstructor
public class KafkaListenerConfig {
	
	private final KafkaTopicsConfig kafkaTopicsConfig;
	private final KafkaProperties properties;
	
	@Bean
	public KafkaAdmin.NewTopics newTopics() {
		
		return new KafkaAdmin.NewTopics(
				Arrays.stream(kafkaTopicsConfig.getAllTopics())
						.map(topicName -> TopicBuilder
								.name(topicName)
								.partitions(10)
								.build()
						).toArray(NewTopic[]::new));
	}
	
	@Bean
	public ReactiveKafkaConsumerTemplate<String, BaseGamingEvent<LevelUpEventMessage>> getReactiveKafkaConsumerTemplate() {
		ReceiverOptions<String, BaseGamingEvent<LevelUpEventMessage>> receiverOptions =
				ReceiverOptions.<String, BaseGamingEvent<LevelUpEventMessage>>create(this.properties.buildConsumerProperties())
						.subscription(List.of(kafkaTopicsConfig.getLevelUp()))
						.withValueDeserializer(converter());
		
		return new ReactiveKafkaConsumerTemplate<>(receiverOptions);
		
	}
	
	@Bean
	public Deserializer<BaseGamingEvent<LevelUpEventMessage>> converter() {
		return new JsonDeserializer<BaseGamingEvent<LevelUpEventMessage>>();
	}
}
