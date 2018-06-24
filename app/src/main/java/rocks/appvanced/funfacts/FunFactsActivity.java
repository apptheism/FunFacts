package rocks.appvanced.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import rocks.appvanced.funfacts.model.ColorWheel;
import rocks.appvanced.funfacts.model.FactBook;

public class FunFactsActivity extends AppCompatActivity {

    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";
    // Declare our view variables
    private TextView tVFacts;
    private Button btnShowFact;
    private FactBook fb;
    private RelativeLayout relativeLayout;
    private ColorWheel colorWheel;

    private static final String TAG = FunFactsActivity.class.getSimpleName();
    private String mFact = fb.getInitialFact();
    private int mColor = colorWheel.getInitialColor();

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mFact = savedInstanceState.getString(KEY_FACT);
        tVFacts.setText(mFact);

        mColor = savedInstanceState.getInt(KEY_COLOR);
        relativeLayout.setBackgroundColor(mColor);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        tVFacts = findViewById(R.id.tVFact);
        btnShowFact = findViewById(R.id.btnShowFunFacts);
        fb = new FactBook();
        colorWheel = new ColorWheel();
        relativeLayout = findViewById(R.id.rlMain);

        // Update the screen with our new fact
        tVFacts.setText(mFact);
        relativeLayout.setBackgroundColor(mColor);
        btnShowFact.setTextColor(mColor);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFact = fb.getFact();
                mColor = colorWheel.getColor();
                // Update the screen with our new fact
                tVFacts.setText(mFact);
                relativeLayout.setBackgroundColor(mColor);
                btnShowFact.setTextColor(mColor);
            }
        };

        btnShowFact.setOnClickListener(ocl);
    }
}
