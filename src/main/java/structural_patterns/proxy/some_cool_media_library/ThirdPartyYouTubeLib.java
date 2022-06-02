package structural_patterns.proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * In this example, the Proxy pattern helps to implement the lazy initialization and caching to an inefficient 3rd-party YouTube integration library.
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
