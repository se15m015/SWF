package teletext.interfaces;

/**
 * Created by domin_000 on 22.03.2016.
 */
public class TeletextCell {

    public String value;
    public String hexBackgroundColor;
    public String hexForegroundColor;
    public int fontSize;

    public TeletextCell()
    {
        value = " ";
        hexBackgroundColor = "#FFFFFF";
        hexForegroundColor = "#000000";
        fontSize = 12;
    }

}
