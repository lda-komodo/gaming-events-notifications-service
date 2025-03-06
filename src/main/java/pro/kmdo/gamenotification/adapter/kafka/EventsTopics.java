package pro.kmdo.gamenotification.adapter.kafka;

public enum EventsTopics {
    PLAYER_LEVEL_UP("gaming.player.level.up"),
    ITEM_ACQUIRED("gaming.item.acquired"),
    CHALLENGE_COMPLETED("gaming.challenge.completed"),
    PVP("gaming.pvp"),
    FRIEND_REQUEST("social.friend.request"),
    FRIEND_REQUEST_ACCEPTED("social.friend.request.accepted"),
    NEW_FOLLOWER("social.new.follower");

    private final String topicName;

    EventsTopics(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public String toString() {
        return this.topicName;
    }
}
