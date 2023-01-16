package L04_Ex004.V1;

public class Program {
    public static void main(String[] args) {
        Repository audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));

        for (int index = 0; index < audioStorage.count(); index++){
            System.out.println(audioStorage.get(index));
        }

        Repository videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideoContent("New movie 1.wmv"));
        videoStorage.add(new VideoContent("New movie 5.3gp"));

        for (int index = 0; index < videoStorage.count(); index++){
            System.out.println(videoStorage.get(index));
        }

        // #region Problem
        audioStorage.add(new VideoContent("blablabla.mp4")); // Video file can be added to Audio repository
        videoStorage.add(new AudioContent("Track 005.wav")); // Audio file can be added to Video repository
        // #endregion


    }
}
