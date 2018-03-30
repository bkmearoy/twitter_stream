package com.fagena.twitter.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

@SerializedName("id")
@Expose
private long id;
@SerializedName("id_str")
@Expose
private String idStr;
@SerializedName("name")
@Expose
private String name;
@SerializedName("screen_name")
@Expose
private String screenName;
@SerializedName("location")
@Expose
private String location;
@SerializedName("url")
@Expose
private Object url;
@SerializedName("description")
@Expose
private Object description;
@SerializedName("translator_type")
@Expose
private String translatorType;
@SerializedName("protected")
@Expose
private boolean _protected;
@SerializedName("verified")
@Expose
private boolean verified;
@SerializedName("followers_count")
@Expose
private long followersCount;
@SerializedName("friends_count")
@Expose
private long friendsCount;
@SerializedName("listed_count")
@Expose
private long listedCount;
@SerializedName("favourites_count")
@Expose
private long favouritesCount;
@SerializedName("statuses_count")
@Expose
private long statusesCount;
@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("utc_offset")
@Expose
private Object utcOffset;
@SerializedName("time_zone")
@Expose
private Object timeZone;
@SerializedName("geo_enabled")
@Expose
private boolean geoEnabled;
@SerializedName("lang")
@Expose
private String lang;
@SerializedName("contributors_enabled")
@Expose
private boolean contributorsEnabled;
@SerializedName("is_translator")
@Expose
private boolean isTranslator;
@SerializedName("profile_background_color")
@Expose
private String profileBackgroundColor;
@SerializedName("profile_background_image_url")
@Expose
private String profileBackgroundImageUrl;
@SerializedName("profile_background_image_url_https")
@Expose
private String profileBackgroundImageUrlHttps;
@SerializedName("profile_background_tile")
@Expose
private boolean profileBackgroundTile;
@SerializedName("profile_link_color")
@Expose
private String profileLinkColor;
@SerializedName("profile_sidebar_border_color")
@Expose
private String profileSidebarBorderColor;
@SerializedName("profile_sidebar_fill_color")
@Expose
private String profileSidebarFillColor;
@SerializedName("profile_text_color")
@Expose
private String profileTextColor;
@SerializedName("profile_use_background_image")
@Expose
private boolean profileUseBackgroundImage;
@SerializedName("profile_image_url")
@Expose
private String profileImageUrl;
@SerializedName("profile_image_url_https")
@Expose
private String profileImageUrlHttps;
@SerializedName("profile_banner_url")
@Expose
private String profileBannerUrl;
@SerializedName("default_profile")
@Expose
private boolean defaultProfile;
@SerializedName("default_profile_image")
@Expose
private boolean defaultProfileImage;
@SerializedName("following")
@Expose
private Object following;
@SerializedName("follow_request_sent")
@Expose
private Object followRequestSent;
@SerializedName("notifications")
@Expose
private Object notifications;

public long getId() {
return id;
}

public void setId(long id) {
this.id = id;
}

public String getIdStr() {
return idStr;
}

public void setIdStr(String idStr) {
this.idStr = idStr;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getScreenName() {
return screenName;
}

public void setScreenName(String screenName) {
this.screenName = screenName;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

public Object getUrl() {
return url;
}

public void setUrl(Object url) {
this.url = url;
}

public Object getDescription() {
return description;
}

public void setDescription(Object description) {
this.description = description;
}

public String getTranslatorType() {
return translatorType;
}

public void setTranslatorType(String translatorType) {
this.translatorType = translatorType;
}

public boolean isProtected() {
return _protected;
}

public void setProtected(boolean _protected) {
this._protected = _protected;
}

public boolean isVerified() {
return verified;
}

public void setVerified(boolean verified) {
this.verified = verified;
}

public long getFollowersCount() {
return followersCount;
}

public void setFollowersCount(long followersCount) {
this.followersCount = followersCount;
}

public long getFriendsCount() {
return friendsCount;
}

public void setFriendsCount(long friendsCount) {
this.friendsCount = friendsCount;
}

public long getListedCount() {
return listedCount;
}

public void setListedCount(long listedCount) {
this.listedCount = listedCount;
}

public long getFavouritesCount() {
return favouritesCount;
}

public void setFavouritesCount(long favouritesCount) {
this.favouritesCount = favouritesCount;
}

public long getStatusesCount() {
return statusesCount;
}

public void setStatusesCount(long statusesCount) {
this.statusesCount = statusesCount;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public Object getUtcOffset() {
return utcOffset;
}

public void setUtcOffset(Object utcOffset) {
this.utcOffset = utcOffset;
}

public Object getTimeZone() {
return timeZone;
}

public void setTimeZone(Object timeZone) {
this.timeZone = timeZone;
}

public boolean isGeoEnabled() {
return geoEnabled;
}

public void setGeoEnabled(boolean geoEnabled) {
this.geoEnabled = geoEnabled;
}

public String getLang() {
return lang;
}

public void setLang(String lang) {
this.lang = lang;
}

public boolean isContributorsEnabled() {
return contributorsEnabled;
}

public void setContributorsEnabled(boolean contributorsEnabled) {
this.contributorsEnabled = contributorsEnabled;
}

public boolean isIsTranslator() {
return isTranslator;
}

public void setIsTranslator(boolean isTranslator) {
this.isTranslator = isTranslator;
}

public String getProfileBackgroundColor() {
return profileBackgroundColor;
}

public void setProfileBackgroundColor(String profileBackgroundColor) {
this.profileBackgroundColor = profileBackgroundColor;
}

public String getProfileBackgroundImageUrl() {
return profileBackgroundImageUrl;
}

public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
this.profileBackgroundImageUrl = profileBackgroundImageUrl;
}

public String getProfileBackgroundImageUrlHttps() {
return profileBackgroundImageUrlHttps;
}

public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
}

public boolean isProfileBackgroundTile() {
return profileBackgroundTile;
}

public void setProfileBackgroundTile(boolean profileBackgroundTile) {
this.profileBackgroundTile = profileBackgroundTile;
}

public String getProfileLinkColor() {
return profileLinkColor;
}

public void setProfileLinkColor(String profileLinkColor) {
this.profileLinkColor = profileLinkColor;
}

public String getProfileSidebarBorderColor() {
return profileSidebarBorderColor;
}

public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
this.profileSidebarBorderColor = profileSidebarBorderColor;
}

public String getProfileSidebarFillColor() {
return profileSidebarFillColor;
}

public void setProfileSidebarFillColor(String profileSidebarFillColor) {
this.profileSidebarFillColor = profileSidebarFillColor;
}

public String getProfileTextColor() {
return profileTextColor;
}

public void setProfileTextColor(String profileTextColor) {
this.profileTextColor = profileTextColor;
}

public boolean isProfileUseBackgroundImage() {
return profileUseBackgroundImage;
}

public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
this.profileUseBackgroundImage = profileUseBackgroundImage;
}

public String getProfileImageUrl() {
return profileImageUrl;
}

public void setProfileImageUrl(String profileImageUrl) {
this.profileImageUrl = profileImageUrl;
}

public String getProfileImageUrlHttps() {
return profileImageUrlHttps;
}

public void setProfileImageUrlHttps(String profileImageUrlHttps) {
this.profileImageUrlHttps = profileImageUrlHttps;
}

public String getProfileBannerUrl() {
return profileBannerUrl;
}

public void setProfileBannerUrl(String profileBannerUrl) {
this.profileBannerUrl = profileBannerUrl;
}

public boolean isDefaultProfile() {
return defaultProfile;
}

public void setDefaultProfile(boolean defaultProfile) {
this.defaultProfile = defaultProfile;
}

public boolean isDefaultProfileImage() {
return defaultProfileImage;
}

public void setDefaultProfileImage(boolean defaultProfileImage) {
this.defaultProfileImage = defaultProfileImage;
}

public Object getFollowing() {
return following;
}

public void setFollowing(Object following) {
this.following = following;
}

public Object getFollowRequestSent() {
return followRequestSent;
}

public void setFollowRequestSent(Object followRequestSent) {
this.followRequestSent = followRequestSent;
}

public Object getNotifications() {
return notifications;
}

public void setNotifications(Object notifications) {
this.notifications = notifications;
}

}