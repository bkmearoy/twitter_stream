package com.fagena.twitter.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedEntities_ {

@SerializedName("media")
@Expose
private List<Medium______> media = null;

public List<Medium______> getMedia() {
return media;
}

public void setMedia(List<Medium______> media) {
this.media = media;
}

}