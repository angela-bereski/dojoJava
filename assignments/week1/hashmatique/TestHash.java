import java.util.Set;
import java.util.HashMap;

public class TestHash {
    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("I Want It That Way", "Tell me why? Ain't nothing but a heartache.");
        trackList.put("Psychokiller", "Psychokiller, qu'est que ce? Fa fa fa fa fa, fa fa fa fa fa.");
        trackList.put("Blister In the Sun", "When Imma walkin I strut my stuff and I'm so stressed out.");
        trackList.put("It's corn!", "It's corn! A big lump with knobs, it has the juice!");

        String song = trackList.get("It's corn!");
        System.out.println(song);

        System.out.println(trackList);

    }
}