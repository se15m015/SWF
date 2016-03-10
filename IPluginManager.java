package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IPluginManager {

    //initialize Plugins -- should be done by felix

    void resolvePage(int page);

    void back();

    void update(IPlugin plugin);
}
