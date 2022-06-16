package com.ilaydabykakova.landmarkbook;

public class Singleton {
    private LandMark sentLandmark;
    //Kendim obje oluşturdum.
    private static Singleton singleton;

    private Singleton(){

    }
    public LandMark getSentLandmark(){
        return sentLandmark;
    }
    public void setSentLandmark(LandMark sentLandmark){
       this.sentLandmark = sentLandmark;
    }
    //getInstance : objesini oluşturmak
    //singeleton.getInstance() nerede çağırısam çağırıyım hep aynı objeyi döndürecektir.
    public static Singleton getInstance(){
        //null ise yeni oluştur.
        if (singleton==null){
            singleton = new Singleton();
        }
        //Daha önceden oluşturulmuşsa oluşturalan static singleton dön.
        return singleton;
    }
}
