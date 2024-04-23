import base.Observer;
import base.Subject;
import base.Subject;
public class FacebookNotifier extends Observer {

    public FacebookNotifier(Subject subject){
        this.subject = subject;
        subject.AttachObserver(this);
    }

    @Override
    public void Notify(Object arg) {


        if(subject instanceof  VideoData)
        {
            VideoData videoData = (VideoData) arg;
            System.out.printf("Notify all subscribers via FaceBook with new data" +
                    "\n\tName: %s" +
                    "\n\tDescription: %s" +
                    "\n\tFile name: %s\n", videoData.GetTitle(), videoData.GetDescription(), videoData.GetFileName());
        }
    }
}
