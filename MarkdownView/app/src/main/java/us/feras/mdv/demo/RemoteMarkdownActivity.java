package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;

import android.os.Bundle;
import androidx.core.app.ComponentActivity;

public class RemoteMarkdownActivity extends ComponentActivity {
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView markdownView = new MarkdownView(this); 
		setContentView(markdownView);
		markdownView.loadMarkdownFile("https://raw.github.com/falnatsheh/MarkdownView/master/README.md");
	}
}
