package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send (View view){
        EditText edNumber = (EditText) findViewById(R.id.ed_num);
       // String number = edNumber.getText().toString();
        int number = Integer.parseInt(edNumber.getText().toString());

        Random random = new Random();
        int i = (int)((Math.random()*10)+1);

        if (i>number){
            new AlertDialog.Builder(this)
                    .setMessage("大一點 "+i)
                    .setNegativeButton("ok",null)
                    .show();
        }else if (i<number){
            new AlertDialog.Builder(this)
                    .setMessage("小一點 "+i)
                    .setNegativeButton("ok",null)
                    .show();
        }else if (i==number){
            new AlertDialog.Builder(this)
                    .setMessage("答對了 ")
                    .show();

        }




       /* new AlertDialog.Builder(this)
                .setMessage(i+" "+number)
                .show();*/
    }
}
