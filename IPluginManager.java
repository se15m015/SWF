package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IPluginManager {

    void initPlugin(IPlugin plugin);

    boolean resolvePage(int page);

    void back();

    void update(IPlugin plugin);
}
