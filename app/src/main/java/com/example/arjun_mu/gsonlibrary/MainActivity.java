package com.example.arjun_mu.gsonlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serialization();

        deserialization();

    }

    private void serialization() {
        Gson gson = new Gson();

        UserSimple userObject = new UserSimple(
                "Norman",
                "norman@futurestud.io",
                26,
                true
        );
        String serialization = gson.toJson(userObject);
        Log.i(TAG, "onCreate: " + serialization);
    }

    private void deserialization() {
        String userJson = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";

        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);
        String a = userObject.getName();

    }
}
