package id.mobiledevidn.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText link;
    Button search;
    WebView viewLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link = (EditText)findViewById(R.id.edLink);
        search = (Button) findViewById(R.id.btSearch);
        viewLink = (WebView) findViewById(R.id.wvLink);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadLink();
            }
        });

    }

    private void loadLink() {
        String linkurl = link.getText().toString();

        viewLink.getSettings().setLoadsImagesAutomatically(true);
        viewLink.getSettings().setJavaScriptEnabled(true);
        viewLink.getSettings().setDomStorageEnabled(true);
        viewLink.loadUrl("https://" + linkurl);
        viewLink.setWebViewClient(new WebViewClient());

    }
}