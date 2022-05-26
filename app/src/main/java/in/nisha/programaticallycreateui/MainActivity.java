package in.nisha.programaticallycreateui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textone;
    private TextView texttwo;
    private TextView textthree;
    private TextView textfour;
    private EditText Enterthenumber;
    private Button btncolor;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        linearLayout.setPadding(20, 20, 20, 20);


        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        linearLayout.setLayoutParams(layoutParams);

        ViewGroup.LayoutParams paramsForView = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        textone = new TextView(this);
        textone.setBackgroundColor(Color.GRAY);
        textone.setPadding(20, 20, 20, 20);
        textone.setLayoutParams(paramsForView);

        linearLayout.addView(textone);

        texttwo = new TextView(this);
        texttwo.setBackgroundColor(Color.GRAY);
        texttwo.setPadding(20, 20, 20, 20);
        texttwo.setLayoutParams(paramsForView);
        linearLayout.addView(texttwo);


        textthree = new TextView(this);
        textthree.setBackgroundColor(Color.GRAY);
        textthree.setPadding(20, 20, 20, 20);
        textthree.setLayoutParams(paramsForView);
        linearLayout.addView(textthree);


        textfour = new TextView(this);
        textfour.setBackgroundColor(Color.GRAY);
        textfour.setPadding(20, 20, 20, 20);
        textfour.setLayoutParams(paramsForView);
        linearLayout.addView(textfour);


        Enterthenumber = new EditText(this);
        Enterthenumber.setHint("Enter color code");
        Enterthenumber.setLayoutParams(paramsForView);
        linearLayout.addView(Enterthenumber);

        btncolor=new Button(this);
        btncolor.setText("Change color");
        linearLayout.addView(btncolor);

        setContentView(linearLayout);
        btncolor.setOnClickListener(new btnEvent());



    }
    class btnEvent implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            String checkColorCode=Enterthenumber.getText().toString();
            switch(checkColorCode){
                case "1":
                    textone.setBackgroundColor(Color.RED);
                    break;

                case "2":
                    texttwo.setBackgroundColor(Color.BLUE);
                    break;


                case "3":
                    textthree.setBackgroundColor(Color.BLACK);
                    break;


                case "4":
                    textfour.setBackgroundColor(Color.YELLOW);
                    break;

                default:
                   Enterthenumber.setText("Enter valid color code");
                    break;





            }


        }
    }
}