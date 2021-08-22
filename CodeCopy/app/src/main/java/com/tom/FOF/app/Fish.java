package com.tom.FOF.app;

public class Fish {
    int fishimage;
    String fishName;
    String description;
    String hLink;


    public Fish(int fishimage, String fishName,
                String description,String hLink) {
        this.fishimage = fishimage;
        this.fishName = fishName;
        this.description=description;
        this.hLink = hLink;
    }
    //PoJO PLAIN OLD JAVA OBJECT

    public int getFishimage() {
        return fishimage;
    }

    public String getFishName() {
        return fishName;
    }

    public String getDescription() {
        return description;
    }

    public String gethLink() {
        return hLink;
    }
}
