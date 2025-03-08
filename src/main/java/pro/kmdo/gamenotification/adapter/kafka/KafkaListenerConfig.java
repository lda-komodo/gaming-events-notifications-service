package pro.kmdo.gamenotification.adapter.kafka;

import lombok.AllArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListenerConfigurer;
import org.springframework.kafka.config.KafkaListenerEndpointRegistrar;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Arrays;

@Configuration
@EnableConfigurationProperties(KafkaTopicsConfig.class)
@AllArgsConstructor
public class KafkaListenerConfig implements KafkaListenerConfigurer {
	
	private final LocalValidatorFactoryBean validator;
	private final KafkaTopicsConfig kafkaTopicsConfig;
	
	@Override
	public void configureKafkaListeners(KafkaListenerEndpointRegistrar registrar) {
		registrar.setValidator(this.validator);
	}
	
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
	public RecordMessageConverter converter() {
		return new JsonMessageConverter();
	}
}
