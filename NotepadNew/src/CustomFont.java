import java.awt.Font;
public class CustomFont extends Font{
    public Font font;
    public static final int MENU_FONT = 16;
    public static final int NOTE_FONT = 14;
    public CustomFont(String name, int style, int size) {
        super(name, style, size);
    }
    public CustomFont(int type){
        super("Comic Sans MS", 1, type);   
    }
    public static Font getNoteFont(){
        return new CustomFont(CustomFont.NOTE_FONT);
    }
    public static Font getMenuFont(){
        return new CustomFont(CustomFont.MENU_FONT);
    }
}
