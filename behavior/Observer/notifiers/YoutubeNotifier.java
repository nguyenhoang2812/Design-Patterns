//package notifiers;
//
//import base.Observer;
//import base.Subject;
//
//public class YoutubeNotifier extends Observer {
//    public YoutubeNotifier(Subject subject){
//        this.subject = subject;
//        subject.NotifyObservers(this);
//    }
//
//    @Override
//    public void Notify(Object arg) {
//
//
//        if(subject instanceof Video)
//        {
//            System.out.printf("Notify all subscribers via Facebook with new data" +
//                    "\n\tName: {0}" +
//                    "\n\tDescription: {1}" +
//                    "\n\tFile name: {2}", videoData.GetTitle(), videoData.GetDescription(), videoData.GetFileName());
//        }
//    }
//}
