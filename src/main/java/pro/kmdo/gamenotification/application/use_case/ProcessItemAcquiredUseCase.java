package pro.kmdo.gamenotification.application.use_case;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.event.BaseGamingEvent;
import pro.kmdo.gamenotification.domain.model.event.ItemAcquiredEventMessage;

@Service
public class ProcessItemAcquiredUseCase extends AbstractBaseUseCase<BaseGamingEvent<ItemAcquiredEventMessage>> {
}
