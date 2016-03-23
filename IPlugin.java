package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IPlugin{

    String[][] provideContent(int page);

    void register(IPluginManager manager);

    void unregister(IPluginManager manager);

    void notifyAllObserver();

}
