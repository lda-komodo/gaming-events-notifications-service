package pro.kmdo.gamenotification.application.use_case;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.LevelUpEventMessage;

@Service
public class ProcessLevelUpUseCase extends AbstractBaseUseCase<BaseGamingEvent<LevelUpEventMessage>> {
}
