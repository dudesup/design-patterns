package structural_patterns.proxy.proxy;

import structural_patterns.proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import structural_patterns.proxy.some_cool_media_library.ThirdPartyYouTubeLibImpl;
import structural_patterns.proxy.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeLibImpl();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);

        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video " + videoId + " from cache");
        }
        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
