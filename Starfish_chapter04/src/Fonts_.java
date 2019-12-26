import java.awt.*;
import java.io.InputStream;

public class Fonts_ {

    private Font font = null;
    public String  Fuente_main = "Games/Fonts/Mark.ttf";
    /*
        https://www.lawebdelprogramador.com/foros/Java/1251835-Fuente-personalizada-en-un-jLabel.html
        https://www.jc-mouse.net/java/cargar-fuente-ttf
        https://codigoderelleno.blogspot.com/2015/07/usando-fuentes-propias-para.html
        http://chuwiki.chuidiang.org/index.php?title=Fuentes_de_texto_en_Java
        */
    public Font fuente(  int estilo, float tamanio)
    {
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream("Fonts/Chocolate Covered Raindrops.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(" No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }


}
