package com.fagena.twitter.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities_ {

@SerializedName("hashtags")
@Expose
private List<Object> hashtags = null;
@SerializedName("urls")
@Expose
private List<Object> urls = null;
@SerializedName("user_mentions")
@Expose
private List<UserMention> userMentions = null;
@SerializedName("symbols")
@Expose
private List<Object> symbols = null;
@SerializedName("media")
@Expose
private List<Medium____> media = null;

public List<Object> getHashtags() {
return hashtags;
}

public void setHashtags(List<Object> hashtags) {
this.hashtags = hashtags;
}

public List<Object> getUrls() {
return urls;
}

public void setUrls(List<Object> urls) {
this.urls = urls;
}

public List<UserMention> getUserMentions() {
return userMentions;
}

public void setUserMentions(List<UserMention> userMentions) {
this.userMentions = userMentions;
}

public List<Object> getSymbols() {
return symbols;
}

public void setSymbols(List<Object> symbols) {
this.symbols = symbols;
}

public List<Medium____> getMedia() {
return media;
}

public void setMedia(List<Medium____> media) {
this.media = media;
}

}