package pro.kmdo.gamenotification.domain.service;

import pro.kmdo.gamenotification.domain.model.notification.Notification;

public interface NotificationServiceInterface {
	Notification processUserNotifications(Notification notification);
}