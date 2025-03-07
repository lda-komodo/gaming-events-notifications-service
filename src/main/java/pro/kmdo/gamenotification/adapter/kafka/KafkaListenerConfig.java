package pro.kmdo.gamenotification.adapter.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
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
public class KafkaListenerConfig implements KafkaListenerConfigurer {
    
    private final LocalValidatorFactoryBean validator;
    
    @Autowired
    public KafkaListenerConfig(LocalValidatorFactoryBean validator) {
        this.validator = validator;
    }
    
    @Override
    public void configureKafkaListeners(KafkaListenerEndpointRegistrar registrar) {
        registrar.setValidator(this.validator);
    }
    
    @Bean
    public KafkaAdmin.NewTopics newTopics() {
        return new KafkaAdmin.NewTopics(
                Arrays.stream(EventsTopics.values())
                        .map(topicName -> TopicBuilder.name(topicName.toString()).build())
                        .toArray(NewTopic[]::new));
    }
    
    @Bean
    public RecordMessageConverter converter() {
        return new JsonMessageConverter();
    }
}
