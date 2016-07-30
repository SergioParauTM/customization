package ejemplo.sergio.personalizacionytemas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      button.setBackground(getDrawable(R.drawable.bttn));
    }
}

