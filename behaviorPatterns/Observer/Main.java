public class Main {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        FacebookNotifier facebookNotifier = new FacebookNotifier(videoData);
        EmailNotifier emailNotifier = new EmailNotifier(videoData);
        InstagramNotifier instagramNotifier = new InstagramNotifier(videoData);


        System.out.println("-------------------------------------------------------------------");
        videoData.SetTitle("Tittle");
        System.out.println("-------------------------------------------------------------------");
        videoData.SetDescription("Observer Design Pattern");
        System.out.println("-------------------------------------------------------------------");
        videoData.SetFileName("Name file");

        System.out.println("-------------------------------------------------------------------");
        videoData.DetachObserver(emailNotifier);
        videoData.SetFileName("no name");

    }
}
