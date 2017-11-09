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
    Random random = new Random();
    int correct = (int)((Math.random()*10)+1);
    public void send (View view){
        EditText edNumber = (EditText) findViewById(R.id.ed_num);
       // String number = edNumber.getText().toString();
        int number = Integer.parseInt(edNumber.getText().toString());

        if (correct>number && 10>=number && 0<=number){
            Toast toastMax = Toast.makeText(this, "大一點"+correct,Toast.LENGTH_LONG);
            toastMax.show();
            edNumber.setText("");
        }else if (correct<number && 10>=number && 0<=number){
            Toast toastMin = Toast.makeText(this, "小一點"+correct,Toast.LENGTH_LONG);
            toastMin.show();
            edNumber.setText("");
        }else if (10<number || 0>number){
            Toast toastN = Toast.makeText(this, "請輸入1~10",Toast.LENGTH_LONG);
            toastN.show();
            edNumber.setText("");
        }else if (correct==number){
            /*new AlertDialog.Builder(this)
                    .setMessage("答對了 ")
                    .show();*/
            Toast toast = Toast.makeText(this, "答對了"+correct,Toast.LENGTH_LONG);
            toast.show();
        }




       /* new AlertDialog.Builder(this)
                .setMessage(i+" "+number)
                .show();*/
    }
}
