package teletext.interfaces;

/**
 * Created by richie on 10/03/16.
 */
public interface IPlugin{

    int[] getPreferedPageNumbers();

    void setOverruledPageNumbers(int[] pageNumbers);

    TeletextCell[][] provideContent(int page);

    void setCurrentPage(int pageNumber);

    void register(IPluginManager manager);

    void unregister(IPluginManager manager);

    void notifyAllObserver();

}
