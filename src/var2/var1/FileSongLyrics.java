package var2.var1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSongLyrics extends SongLyrics {


    String file;

    FileSongLyrics(String file) {
        this.file = file;
    }




    @Override
    public String getTextSong(String title) {
        StringBuilder songText = new StringBuilder();
        boolean found = false;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isSongFound = false;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(title + ":")) {
                    isSongFound = true;
                    found = true;
                } else if (line.equals(">") && isSongFound) {
                    break;

                } else if (isSongFound) {
                    songText.append(line).append("\n");
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (!found) {
            return ":(";
        }
        return songText.toString();
    }
}
