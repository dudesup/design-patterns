package structural_patterns.proxy.some_cool_media_library;

import lombok.Getter;

@Getter
public class Video {
    String id;
    String title;
    String data = "Random video";

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
