package fast.sieu.fastorder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToScanQrCode(View view) {
        Intent intent = new Intent(this, ScanQrActivity.class);
        startActivity(intent);
    }
}
