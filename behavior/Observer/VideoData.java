
import base.Subject;

public class VideoData extends Subject {

    private String _title;
    private String _description;
    private String _fileName;

    public VideoData(){
    }

    public String GetTitle()
    {
        return _title;
    }

    public void SetTitle(String value)
    {
        _title = value;
        VideoDataChanged();
    }

    public String GetDescription()
    {
        return _description;
    }

    public void SetDescription(String value)
    {
        _description = value;
        VideoDataChanged();
    }

    public String GetFileName()
    {
        return _fileName;
    }

    public void SetFileName(String value)
    {
        _fileName = value;
        VideoDataChanged();
    }


    private void VideoDataChanged()
    {
        NotifyObservers(this);
    }
}

