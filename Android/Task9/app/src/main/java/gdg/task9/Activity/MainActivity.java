package gdg.task9.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gdg.task9.R;
import gdg.task9.Service.PlayBackService;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "PlayBackService";
    private Button mPlayButton, mStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (Button) findViewById(R.id.button_play);
        mStopButton = (Button) findViewById(R.id.button_stop);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, PlayBackService.class));
            }
        });

        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, PlayBackService.class));
            }
        });
    }
}
