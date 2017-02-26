package dawn.chinesepolyphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_chongqinga,tv_chongqingb;
    TextView tv_changshaa,tv_changshab;
    TextView tv_kuaijia,tv_kuaijib;
    Button button;
    CharacterParser characterParser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        characterParser = new CharacterParser();
        initView();
        intListener();
    }

    private void initView(){
        tv_chongqinga = (TextView) findViewById(R.id.character_chongqing);
        tv_chongqingb = (TextView) findViewById(R.id.phoneticize_chongqing);
        tv_changshaa = (TextView) findViewById(R.id.character_changsha);
        tv_changshab = (TextView) findViewById(R.id.phoneticize_changsha);
        tv_kuaijia = (TextView) findViewById(R.id.character_kuaiji);
        tv_kuaijib = (TextView) findViewById(R.id.phoneticize_kuaiji);
        button = (Button) findViewById(R.id.transform);
    }

    private void intListener(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_chongqingb.setText(characterParser.getSellingWithPolyphone(tv_chongqinga.getText().toString().trim()));
                tv_kuaijib.setText(characterParser.getSellingWithPolyphone(tv_kuaijia.getText().toString().trim()));
                tv_changshab.setText(characterParser.getSellingWithPolyphone(tv_changshaa.getText().toString().trim()));
            }
        });
    }


}
