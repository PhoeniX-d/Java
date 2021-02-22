import java.awt.*;
class Fonts
{
    public static void main(String[] args) 
    {
        // get local graphics environment imformation into GraphicsEnvironment object ge
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        // from ge, get available font family names 
        String fonts[] = ge.getAvailableFontFamilyNames();

        System.out.println("Available font family are:\n");
        for(int i = 0; i < fonts.length; i++)
        {
            System.out.println(fonts[i]);
        }
    }
}
