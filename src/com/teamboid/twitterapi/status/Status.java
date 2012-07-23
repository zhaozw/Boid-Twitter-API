package com.teamboid.twitterapi.status;

import com.teamboid.twitterapi.entity.hashtag.HashtagEntity;
import com.teamboid.twitterapi.entity.media.MediaEntity;
import com.teamboid.twitterapi.entity.mention.MentionEntity;
import com.teamboid.twitterapi.entity.url.UrlEntity;
import com.teamboid.twitterapi.user.User;

import java.util.Calendar;

/**
 * Represents a Tweet on Twitter.
 * @author Aidan Follestad
 */
public interface Status {

    /**
     * Gets the ID of the tweet.
     */
    long getId();

    /**
     * Gets whether or not the authenticated user has favorited this tweet.
     * @return
     */
    boolean isFavorited();

    /**
     * This does not actually favorite the Tweet on Twitter, this function is used in the library.
     */
    void setFavorited(boolean isFavorited);

    /**
     * Gets the date and time the tweet was composed.
     */
    Calendar getCreatedAt();

    /**
     * Gets whether or not the Tweet has been truncated.
     */
    boolean isTruncated();

    /**
     * Gets the URL entities contained in the Tweet;
     * URL entities are useful for expanding t.co URLs.
     */
    UrlEntity[] getUrlEntities();

    /**
     * Gets the URL entities contained in a Tweet;
     * Media entities are useful for extracting the images held in a tweet.
     */
    MediaEntity[] getMediaEntities();

    /**
     * Gets the hashtag entities contained in a Tweet;
     * Hashtag entities are useful for extracting hashtags without using methods like regular expressions.
     */
    HashtagEntity[] getHashtagEntities();

    /**
     * Gets the mention entities contained in a Tweet;
     * Mention entities are useful for extracting mentions without using methods like regular expressions.
     */
    MentionEntity[] getMentionEntities();

    /**
     * Gets the {@link User} object of the user that created the tweet.
     */
    User getUser();

    /**
     * Gets the main content contained in the tweet, will be 140 characters or less.
     */
    String getText();

    /**
     * Gets the application that was used to create the Tweet.
     * Most apps display text like "via source"; for an example, the source could be 'Boid for Android'.
     */
    String getSource();

    /**
     * Gets the ID of the status that this tweet is in reply to (if any).
     */
    long getInReplyToStatusId();

    /**
     * Gets the ID of the user that created the tweet that this tweet is in reply to.
     */
    long getInReplyToUserId();

    /**
     * Gets the screen name of the user that created the tweet that this tweet is in reply to.
     */
    String getInReplyToScreenName();

    /**
     * Gets the number of times this tweet has been retweeted by other users.
     */
    long getRetweetCount();

    /**
     * Gets whether or not the authenticated user has retweeted this tweet.
     */
    boolean isRetweeted();
}
