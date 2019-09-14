package louis.matutino.com.matutinolouisexercise1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View V) {

        switch (V.getId()) {
            case R.id.button4:
                Intent intent1 = new Intent(this, place1.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, place2.class);
                startActivity(intent2);
                break;
            case R.id.button5:
                Intent intent3 = new Intent(this, place3.class);
                startActivity(intent3);
                break;
            case R.id.button6:
                Intent intent4 = new Intent(this, MainActivity.class);
                startActivity(intent4);
                break;

            default:
                break;
        }
    }//end on click
}
