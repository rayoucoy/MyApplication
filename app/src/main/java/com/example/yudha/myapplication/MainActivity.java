package com.example.yudha.myapplication;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();

        // Chatlist tab
        Intent intentChatlist = new Intent().setClass(this, ChatlistActivity.class);
        TabSpec tabSpecChatlist = tabHost
                .newTabSpec("Chatlist")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_chatlist))
                .setContent(intentChatlist);

        // Friendlist tab
        Intent intentFriendlist = new Intent().setClass(this, FriendlistActivity.class);
        TabSpec tabSpecFriendlist = tabHost
                .newTabSpec("Friendlist")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_friendlist))
                .setContent(intentFriendlist);

        // Maps tab
        Intent intentMaps = new Intent().setClass(this, MapsActivity.class);
        TabSpec tabSpecMaps = tabHost
                .newTabSpec("Maps")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_maps))
                .setContent(intentMaps);

        // Profile tab
        Intent intentProfile = new Intent().setClass(this, ProfileActivity.class);
        TabSpec tabSpecProfile = tabHost
                .newTabSpec("Profile")
                .setIndicator("", ressources.getDrawable(R.drawable.icon_profile))
                .setContent(intentProfile);

        // add all tabs
        tabHost.addTab(tabSpecChatlist);
        tabHost.addTab(tabSpecFriendlist);
        tabHost.addTab(tabSpecMaps);
        tabHost.addTab(tabSpecProfile);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(2);
    }

}