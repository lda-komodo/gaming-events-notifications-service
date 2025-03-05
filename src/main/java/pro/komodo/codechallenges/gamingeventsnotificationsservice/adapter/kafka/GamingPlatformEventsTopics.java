package pro.komodo.codechallenges.gamingeventsnotificationsservice.adapter.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.Arrays;

public enum GamingPlatformEventsTopics {
    PLAYER_LEVEL_UP,
    ITEM_ACQUIRED,
    CHALLENGE_COMPLETED,
    PVP,
    FRIEND_REQUEST,
    FRIEND_REQUEST_ACCEPTED,
    NEW_FOLLOWER;

    @Override
    public String toString() {
        return switch (this) {
            case PLAYER_LEVEL_UP -> "gaming.player.level.up";
            case ITEM_ACQUIRED -> "gaming.item.acquired";
            case CHALLENGE_COMPLETED -> "gaming.challenge.completed";
            case PVP -> "gaming.pvp";
            case FRIEND_REQUEST -> "social.friend.request";
            case FRIEND_REQUEST_ACCEPTED -> "social.friend.request.accepted";
            case NEW_FOLLOWER -> "social.new.follower";
        };
    }
}
