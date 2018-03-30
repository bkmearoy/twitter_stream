package com.fagena.twitter.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes__ {

@SerializedName("thumb")
@Expose
private Thumb__ thumb;
@SerializedName("large")
@Expose
private Large__ large;
@SerializedName("small")
@Expose
private Small__ small;
@SerializedName("medium")
@Expose
private Medium_____ medium;

public Thumb__ getThumb() {
return thumb;
}

public void setThumb(Thumb__ thumb) {
this.thumb = thumb;
}

public Large__ getLarge() {
return large;
}

public void setLarge(Large__ large) {
this.large = large;
}

public Small__ getSmall() {
return small;
}

public void setSmall(Small__ small) {
this.small = small;
}

public Medium_____ getMedium() {
return medium;
}

public void setMedium(Medium_____ medium) {
this.medium = medium;
}

}