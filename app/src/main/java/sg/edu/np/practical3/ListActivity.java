package sg.edu.np.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.math.BigInteger;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    final private static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.v(TAG, "List Activity - onStart");

        ImageView image = findViewById(R.id.imageView);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileView();
            }
        });
    }

    private void profileView(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(false);
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("num", randNum());
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private int randNum(){
        Random rand = new Random();
        return rand.nextInt(999999999);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "List Activity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "List Activity - onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "List Activity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "List Activity - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "List Activity - onDestroy");
    }
}