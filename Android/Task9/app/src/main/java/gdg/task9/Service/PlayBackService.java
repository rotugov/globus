package gdg.task9.Service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import gdg.task9.R;

public class PlayBackService extends Service {

    final String TAG = "PlayBackService";
    private MediaPlayer player;
    private Thread mPlayerThread;

    public PlayBackService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate ... " + Thread.currentThread().getName());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand ...");

        if(mPlayerThread == null) {
            mPlayerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Log.i(TAG, "onCreate ... " + Thread.currentThread().getName());
                    player = MediaPlayer.create(PlayBackService.this, R.raw.music);
                    player.start();
                }
            });

            mPlayerThread.start();
        }

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayerThread.interrupt();
        Log.i(TAG, "onDestroy ...");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
