package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IPlugin extends IObserver{

    String[][] provideContent(int page);

    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyAllObserver();

}
