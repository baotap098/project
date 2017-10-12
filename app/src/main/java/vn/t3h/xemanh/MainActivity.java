package vn.t3h.xemanh;

import android.media.Image;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Photo> arr = new ArrayList<>();
    Button btnNext, btnBack;
    int pos = 0;
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        setup();
        addEnvents();
    }
    private void setup() {
        arr.add(new Photo(R.drawable.a01,"111111asfasf111asfafa1111112"));
        arr.add(new Photo(R.drawable.a02,"11111sdfgsdfg111asfasf11111113"));
        arr.add(new Photo(R.drawable.a03,"1111111fdgas1111afasf11114"));
        arr.add(new Photo(R.drawable.a04,"111dfzhfd1111111asfasf111115"));
        arr.add(new Photo(R.drawable.a05,"11111adfgdaf1111asfasf1111116"));
        arr.add(new Photo(R.drawable.a06,"1111111gfgsfdg111111117"));
        arr.add(new Photo(R.drawable.a07,"11111111asfasf11fafasf111119"));
        arr.add(new Photo(R.drawable.a08,"11111hafdhaf111111asfasf11111+"));
        arr.add(new Photo(R.drawable.a09,"111111111afasfa111asfasf1111+"));
        arr.add(new Photo(R.drawable.a10,"111111111afasf111111afasfa14444"));
        arr.add(new Photo(R.drawable.a11,"111111111afafafasfasf1111sfasf1188881"));

        img.setImageResource(arr.get(pos).getImage());
        txt.setText(arr.get(pos).getText());

    }

    private void addEnvents() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos++;
                //img.setImageResource(arr.get(pos%arr.size()));
                if(pos==arr.size())
                    pos=0;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos--;
                if(pos<0)
                    pos=arr.size()-1;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });

    }
    private void addControl() {
        img = (ImageView) findViewById(R.id.img);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnBack = (Button) findViewById(R.id.btnBack);
        txt = (TextView) findViewById(R.id.txt);
    }



}
