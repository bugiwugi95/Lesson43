package var2.var1;

public class Main {
    public static void main(String[] args) {
        FileSongLyrics fileSongLyrics = new FileSongLyrics( "SongText.txt.txt");
       String r = fileSongLyrics.getTextSong("Avicii-\tBroken Arrows");
        System.out.println(r);
    }
}