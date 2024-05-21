package var2.var1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DirectorySongLyrics extends SongLyrics {



    String directory;



    DirectorySongLyrics(String directory) {
        this.directory = directory;

    }


    @Override
    public String getTextSong(String title) {
        File dirF = new File(this.directory);
        StringBuilder songText = new StringBuilder();
        String line = "";
        if (dirF.exists()){
            File file = new File(dirF,title);
            if (file.exists()){
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(title))) {
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else {
                System.out.println("nety f");
            }
        } else {
            System.out.println("nety dir");
        }



        return line;
    }
}
