package ru.netology.domain;

public class PostVk {
    private int recordId;
    private String authorRecordId;
    private int ownerId; // поле из документации;
    private int createdBy; // поле из документации;
    private int replyOwnerId; // поле из документации;
    private int replyPostId; // поле из документации;
    private String date;
    private String text;
    private String imageUrl;
    private String videoUrl;
    private String linkUrl;
    private boolean onlyFriends;
    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private GeosInfo geosInfo;
    private String postType; // поле из документации;
    private PostSource postSource; // поле из документации;
    private int signerId; // поле из документации;
    private boolean canAddedFavorite;
    private boolean canPinRecord;
    private boolean canEditRecord;
    private boolean canDeleteRecord;
    private boolean isRecordPinned;
    private boolean markedAsAds; // поле из документации;
    private int postponedId; // поле из документации;

// + get/set на все поля
}
