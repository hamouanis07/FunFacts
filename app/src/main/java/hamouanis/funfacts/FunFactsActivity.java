package hamouanis.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView factTextView;
    private Button showButtonFact;
    private RelativeLayout relativeLayout;

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = (TextView) findViewById(R.id.funTextView);
        showButtonFact = (Button) findViewById(R.id.showFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.layout);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            factTextView.setText(factBook.getFact());

                int color = colorWheel.getColor();
            relativeLayout.setBackgroundColor(color);
                showButtonFact.setTextColor(color);


            }
        };

        showButtonFact.setOnClickListener(listener);

        //pop-pu
        Toast.makeText(this, "Yay! Our activivty was created.", Toast.LENGTH_LONG).show();

        //to find errors or crushes easily with the tag d = debug
        Log.d(TAG, "We're logging from the OnCreat() Method!");






     }
}
