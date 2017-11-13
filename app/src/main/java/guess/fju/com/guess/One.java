package guess.fju.com.guess;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lin iris on 2017/11/13.
 */

public class One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_con);
    }
    int correct = (int) ((Math.random() * 100) + 1);
    public void check (View view) {
        EditText edNum = (EditText) findViewById(R.id.ed_num);
        TextView tvMin = (TextView) findViewById(R.id.tv_min);
        TextView tvMax = (TextView) findViewById(R.id.tv_max);
        int num = Integer.parseInt(edNum.getText().toString());
        int min = Integer.parseInt(tvMin.getText().toString());
        int max = Integer.parseInt(tvMax.getText().toString());
        if (num < correct && num>min) {
            String number = edNum.getText().toString();
            tvMin.setText(number);
            //Toast toastmin = Toast.makeText(this, num+" "+correct, Toast.LENGTH_LONG);
            //toastmin.show();
            //edNum.setSelection(1);
            edNum.setText("");

        } else if (num > correct && num<max) {
            String number = edNum.getText().toString();
            tvMax.setText(number);
            //Toast toastmax = Toast.makeText(this, num+" "+correct, Toast.LENGTH_LONG);
            //toastmax.show();
            //edNum.setSelection(1);
            edNum.setText("");

        } else if (100 < num || 0 > num || num>max || num<min) {
            Toast toastN = Toast.makeText(this, "請輸入" + min + " ~ " + max, Toast.LENGTH_LONG);
            toastN.show();
            //edNum.setSelection(1);
            edNum.setText("");
        } else if (correct == num) {
            new AlertDialog.Builder(this)
                    .setMessage("答對了!!")
                    .setTitle("Guess")
                    .setPositiveButton("OK", null)
                    .show();
        }

    }
}