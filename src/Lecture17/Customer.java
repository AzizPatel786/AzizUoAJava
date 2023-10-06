package Lecture17;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Video> _videos;

    public Customer() {
        _videos = new ArrayList<Video>();
        _videos.add(new Video());
    }

    public boolean rent(Video video) {
        if (_videos.size() < 7){
            _videos.add(video);
            video.getOnRent(this);
            return true;
        }
        return false;
    }

    public List<Video> getVideos() {
        return _videos;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println(c1.getVideos().isEmpty());
    }
}
