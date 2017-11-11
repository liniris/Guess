package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        //Random random = new Random();
        int correct = (int) ((Math.random() * 10) + 1);
    /*public MainActivity(int correct){
        this.correct = correct;
    }*/
    public void send (View view){
        EditText edNumber = (EditText) findViewById(R.id.ed_num);
        TextView tvAns = (TextView) findViewById(R.id.tv_ans);
        int number = Integer.parseInt(edNumber.getText().toString());

        if (correct>number && 10>=number && 0<=number){
            //Toast toastMax = Toast.makeText(this, "大一點",Toast.LENGTH_LONG);
            //toastMax.show();
            tvAns.setText("大一點");
            edNumber.setText("");
        }else if (correct<number && 10>=number && 0<=number){
            //Toast toastMin = Toast.makeText(this, "小一點",Toast.LENGTH_LONG);
            //toastMin.show();
            tvAns.setText("小一點");
            edNumber.setText("");
        }else if (10<number || 0>number){
            //Toast toastN = Toast.makeText(this, "請輸入1~10",Toast.LENGTH_LONG);
            //toastN.show();
            tvAns.setText("請輸入1~10");
            edNumber.setText("");
        }else if (correct==number){
            /*new AlertDialog.Builder(this)
                    .setMessage("答對了!!")
                    .setPositiveButton("OK",null)
                    .show();*/
            tvAns.setText("答對了!!!");
        }




       /* new AlertDialog.Builder(this)
                .setMessage(i+" "+number)
                .show();*/
    }
}
