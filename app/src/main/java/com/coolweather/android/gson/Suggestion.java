package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CardWash cardWash;

    @SerializedName("sport")
    public Sprot sprot;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CardWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sprot {
        @SerializedName("txt")
        public String info;
    }
}
