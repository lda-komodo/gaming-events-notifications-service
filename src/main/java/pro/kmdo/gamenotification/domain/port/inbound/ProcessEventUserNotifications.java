package pro.kmdo.gamenotification.domain.port.inbound;

public interface ProcessEventUserNotifications<T> {
	void execute(T event);
}
