package louis.matutino.com.matutinolouisexercise1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class place3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place3);
    }
    public void onClick(View V) {
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);

    }
}
