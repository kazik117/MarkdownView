package us.feras.mdv.demo;

import android.content.Intent;
import androidx.core.app.ComponentActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayDataActivity(View view) {
        this.startActivity(new Intent(this, MarkdownDataActivity.class));
    }

    public void displayThemesActivity(View view) {
        this.startActivity(new Intent(this, MarkdownThemesActivity.class));
    }

    public void displayOnlineMdActivity(View view) {
        this.startActivity(new Intent(this, RemoteMarkdownActivity.class));
    }

    public void displayLocalMdFileActivity(View view) {
        this.startActivity(new Intent(this, LocalMarkdownActivity.class));
    }

}
