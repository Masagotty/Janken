package android.lifeistech.com.janken;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView player;
    ImageView cpu;
    TextView result;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (ImageView)findViewById(R.id.player);
        cpu = (ImageView)findViewById(R.id.cpu);
        result = (TextView)findViewById(R.id.result);
    }

    public void goo(View v) {
        player.setImageResource(R.drawable.goo);
        Random random = new Random();
        number = random.nextInt(3);

        if (number == 0) {
            cpu.setImageResource(R.drawable.goo);
            result.setTextColor(Color.rgb(0,0,0));
            result.setText("あいこです");
        }else if (number == 1) {
            cpu.setImageResource(R.drawable.choki);
            result.setTextColor(Color.rgb(255,0,0));
            result.setText("あなたの勝ちです");
        }else if (number == 2) {
            cpu.setImageResource(R.drawable.paa);
            result.setTextColor(Color.rgb(0,0,255));
            result.setText("あなたの負けです");
        }
    }

    public void choki(View v) {
        player.setImageResource(R.drawable.choki);
        Random random = new Random();
        number = random.nextInt(3);

        if (number == 0) {
            cpu.setImageResource(R.drawable.goo);
            result.setTextColor(Color.rgb(0,0,255));
            result.setText("あなたの負けです");
        }else if (number == 1) {
            cpu.setImageResource(R.drawable.choki);
            result.setTextColor(Color.rgb(0,0,0));
            result.setText("あいこです");
        }else if (number == 2) {
            cpu.setImageResource(R.drawable.paa);
            result.setTextColor(Color.rgb(255,0,0));
            result.setText("あなたの勝ちです");
        }
    }

    public void paa(View v) {
        player.setImageResource(R.drawable.paa);
        Random random = new Random();
        number = random.nextInt(3);

        if (number == 0) {
            cpu.setImageResource(R.drawable.goo);
            result.setTextColor(Color.rgb(255,0,0));
            result.setText("あなたの勝ちです");
        }else if (number == 1) {
            cpu.setImageResource(R.drawable.choki);
            result.setTextColor(Color.rgb(0,0,255));
            result.setText("あなたの負けです");
        }else if (number == 2) {
            cpu.setImageResource(R.drawable.paa);
            result.setTextColor(Color.rgb(0,0,0));
            result.setText("あいこです");
        }
    }
}
