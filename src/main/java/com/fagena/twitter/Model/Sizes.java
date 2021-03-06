package com.fagena.twitter.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes {

@SerializedName("thumb")
@Expose
private Thumb thumb;
@SerializedName("large")
@Expose
private Large large;
@SerializedName("small")
@Expose
private Small small;
@SerializedName("medium")
@Expose
private Medium_ medium;

public Thumb getThumb() {
return thumb;
}

public void setThumb(Thumb thumb) {
this.thumb = thumb;
}

public Large getLarge() {
return large;
}

public void setLarge(Large large) {
this.large = large;
}

public Small getSmall() {
return small;
}

public void setSmall(Small small) {
this.small = small;
}

public Medium_ getMedium() {
return medium;
}

public void setMedium(Medium_ medium) {
this.medium = medium;
}

}