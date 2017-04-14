package com.example.thanhnam.demoservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by ThanhNam on 4/2/2017.
 */

public class MusicService extends Service {
    MediaPlayer mediaPlayer;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service dang chay",Toast.LENGTH_LONG).show();
        mediaPlayer=MediaPlayer.create(this,R.raw.dieuanhbiet);
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        mediaPlayer.release();

    }
}
