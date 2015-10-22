package khp.hosen.com.flexiblerssreader;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
/**
 * Created by a09348 on 10/22/2015.
 */
public class second extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        WebView w1=(WebView)findViewById(R.id.webView);
        w1.loadUrl("http://tutorialspoint.com/android/sampleXML.xml");
    }
}
