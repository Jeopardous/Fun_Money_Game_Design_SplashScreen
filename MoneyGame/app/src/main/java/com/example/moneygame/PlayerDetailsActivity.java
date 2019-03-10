package com.example.moneygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerDetailsActivity extends AppCompatActivity {

    Button mReadyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        mReadyButton=findViewById(R.id.game_ready_button);
    }
    public void onReadyGame(View view)
    {
        Intent intent=new Intent(PlayerDetailsActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
