package com.example.musicalstructure;

public class Display {
    private String mAlbumName;
    private String mArtistName;
    private int mImageResourceId;

    public Display(String AlbumName, String ArtistName, int ImageResourceId){
        mAlbumName = AlbumName;
        mArtistName = ArtistName;
        mImageResourceId = ImageResourceId;
    }
    public String getAlbumName()
    {
        return mAlbumName;
    }
    public String getArtistName()
    {
        return mArtistName;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

}
