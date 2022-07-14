package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;

import android.os.Bundle;
import androidx.core.app.ComponentActivity;

public class LocalMarkdownActivity extends ComponentActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView webView = new MarkdownView(this);
		setContentView(webView);
		webView.loadMarkdownFile("file:///android_asset/hello.md");
	}
}
