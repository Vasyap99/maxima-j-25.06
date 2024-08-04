package dz25_06;

public interface Pult{
    void setTs(ITVset ts);

    void switchChannelTo(int i);

    void switchChannelForward();

    void switchChannelBack();

    void switchToPreviousChannel();
}