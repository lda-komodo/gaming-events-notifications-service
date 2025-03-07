package pro.kmdo.gamenotification.domain.service;

public interface NotificationServiceInterface<Notification> {
	Notification processUserNotifications(Notification notification);
}