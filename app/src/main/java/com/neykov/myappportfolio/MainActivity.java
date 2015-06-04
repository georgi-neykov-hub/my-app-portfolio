package com.neykov.myappportfolio;

import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.spotifyStreamerButton).setOnClickListener(mButtonCLickListener);
        findViewById(R.id.footbalScoresButton).setOnClickListener(mButtonCLickListener);
        findViewById(R.id.libraryAppButton).setOnClickListener(mButtonCLickListener);
        findViewById(R.id.buildItBiggerButton).setOnClickListener(mButtonCLickListener);
        findViewById(R.id.xyzReaderButton).setOnClickListener(mButtonCLickListener);
        findViewById(R.id.capstoneAppButton).setOnClickListener(mButtonCLickListener);
    }

    private final View.OnClickListener mButtonCLickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int toastMessageResId;
            switch (v.getId()) {
                case R.id.spotifyStreamerButton:
                    toastMessageResId = R.string.label_open_spotifyStreamer;
                    break;
                case R.id.footbalScoresButton:
                    toastMessageResId = R.string.label_open_superDuoApp;
                    break;
                case R.id.libraryAppButton:
                    toastMessageResId = R.string.label_open_superDuoLibrary;
                    break;
                case R.id.buildItBiggerButton:
                    toastMessageResId = R.string.label_open_buildItBigger;
                    break;
                case R.id.xyzReaderButton:
                    toastMessageResId = R.string.label_open_xyzReader;
                    break;
                case R.id.capstoneAppButton:
                    toastMessageResId = R.string.label_open_capstone;
                    break;
                default:
                    toastMessageResId = -1;
            }

            if (toastMessageResId != -1) {
                showShortMessage(toastMessageResId);
            }
        }
    };

    /**
     * Creates a short-lived Snackbar at the bottom of the screen.
     * Snackbars serve the same purpose of Toasts, but do not permit overlap.
     *
     * @param messageId String resource to be displayed
     */
    private void showShortMessage(@StringRes int messageId) {
        Snackbar.make(findViewById(android.R.id.content), messageId, Snackbar.LENGTH_SHORT)
                .show();
    }
}
