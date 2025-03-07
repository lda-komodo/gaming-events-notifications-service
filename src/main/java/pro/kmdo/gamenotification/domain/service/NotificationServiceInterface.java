package pro.kmdo.gamenotification.domain.service;

public interface NotificationServiceInterface<T> {
	T processUserNotifications(T notification);
}