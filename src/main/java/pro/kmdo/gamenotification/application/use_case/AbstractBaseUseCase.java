package pro.kmdo.gamenotification.application.use_case;

import pro.kmdo.gamenotification.domain.port.inbound.ProcessEventUserNotifications;

public class AbstractBaseUseCase<T> implements ProcessEventUserNotifications<T> {
	@Override
	public void execute(T event) {
	
	}
}
