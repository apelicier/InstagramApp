package com.example.myinstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oyDiRUFSaPZLrI0K1IbM1jWWTgcgR2jMKaxw1iPi")
                .clientKey("FBjS03D4e6yIBhiBMvtQZt3CoWTp8rfL2jWECXM7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
