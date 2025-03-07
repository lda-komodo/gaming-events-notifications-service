package pro.kmdo.gamenotification.domain.service.impl;

import org.springframework.stereotype.Service;
import pro.kmdo.gamenotification.domain.model.notification.Notification;
import pro.kmdo.gamenotification.domain.service.NotificationServiceInterface;

@Service
public class NotificationsService implements NotificationServiceInterface<Notification> {
	@Override
	public Notification processUserNotifications(Notification notification) {
		return notification;
	}
}
