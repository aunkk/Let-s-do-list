import java.awt.Font;
public class CustomFont extends Font{
    private Font font;
    private static final int MENU_FONT = 16;
    private static final int NOTE_FONT = 14;
    private CustomFont(String name, int style, int size) {
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















