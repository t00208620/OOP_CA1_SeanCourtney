package assesment;

import java.util.Arrays;

public class Album {

    private String name;
    private Song tracks [];
    private String producer;
    private int releaseYear;

    public Album(String name, Song tracks[], String producer, int releaseYear)
    {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfTracks(){
        for(int i=0;i<tracks.length;i++)
        {
            if(tracks[i] != null)
            {
             trackID = tracks[i].getNumberOfTracks();
            }
            for(int j=0;j<tracks.length;i++)
            {
                if(tracks[j] !=null)
                    tracks++;

            }
        }

    }


    public int getPlayingTime(int duration){
        for(int i=0;i<duration;i++) {
            if (duration[i] != null)
                duration +=;
        }

        public int playTrack(){
            for(int i=0;i<tracks.length;i++)
                if()
        }

        }



    public String toString() {
        return "\nName:" + getName() + "\nProducer:" + getProducer() + "\nRelease Year:" + getReleaseYear() + "\nNumber Of Tracks:" +
                getNumberOfTracks();

    }
}
