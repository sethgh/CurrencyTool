// Author: M. Seth

package michael.currencytool;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button1, cbutton1, cbutton2, cbutton3, cbutton4, cbutton5, cbutton6, cbutton7, cbutton8, cbutton9, cbutton10, cbutton11, cbutton12, cbutton13, cbutton14, cbutton15, cbutton16,
            cbutton17, cbutton18, cbutton19, cbutton20, cbutton21, cbutton22, cbutton23, cbutton24, cbutton25, cbutton26, cbutton27, cbutton28, cbutton29, cbutton30, cbutton31, cbutton32;

    public TextView tviewm, tviewm2, tview1, tview2, tview3, tview4, tview5, tview6, tview7, tview8, tview9, tview10, tview11, tview12, tview13, tview14, tview15, tview16, tview17, tview18,
            tview19, tview20, tview21, tview22, tview23, tview24, tview25, tview26, tview27, tview28, tview29, tview30, tview31, tview32;

    public LinearLayout llayout1;
    public LinearLayout llayout3;

    public final String[] currencyNames  = {"USD","JPY","BGN","CZK","DKK","GBP","HUF","PLN","RON","SEK","CHF","NOK","HRK","RUB","TRY","AUD","BRL","CAD","CNY","HKD","IDR","ILS","INR","KRW","MXN","MYR","NZD","PHP","SGD","THB","ZAR", "EUR"};
    public String[] currencyValuesBase;
    public double[] currencyValuesFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.SelectCurrencyButton);
        cbutton1 = (Button) findViewById(R.id.button001);
        cbutton2 = (Button) findViewById(R.id.button002);
        cbutton3 = (Button) findViewById(R.id.button003);
        cbutton4 = (Button) findViewById(R.id.button004);
        cbutton5 = (Button) findViewById(R.id.button005);
        cbutton6 = (Button) findViewById(R.id.button006);
        cbutton7 = (Button) findViewById(R.id.button007);
        cbutton8 = (Button) findViewById(R.id.button008);
        cbutton9 = (Button) findViewById(R.id.button009);
        cbutton10 = (Button) findViewById(R.id.button010);
        cbutton11 = (Button) findViewById(R.id.button011);
        cbutton12 = (Button) findViewById(R.id.button012);
        cbutton13 = (Button) findViewById(R.id.button013);
        cbutton14 = (Button) findViewById(R.id.button014);
        cbutton15 = (Button) findViewById(R.id.button015);
        cbutton16 = (Button) findViewById(R.id.button016);
        cbutton17 = (Button) findViewById(R.id.button017);
        cbutton18 = (Button) findViewById(R.id.button018);
        cbutton19 = (Button) findViewById(R.id.button019);
        cbutton20 = (Button) findViewById(R.id.button020);
        cbutton21 = (Button) findViewById(R.id.button021);
        cbutton22 = (Button) findViewById(R.id.button022);
        cbutton23 = (Button) findViewById(R.id.button023);
        cbutton24 = (Button) findViewById(R.id.button024);
        cbutton25 = (Button) findViewById(R.id.button025);
        cbutton26 = (Button) findViewById(R.id.button026);
        cbutton27 = (Button) findViewById(R.id.button027);
        cbutton28 = (Button) findViewById(R.id.button028);
        cbutton29 = (Button) findViewById(R.id.button029);
        cbutton30 = (Button) findViewById(R.id.button030);
        cbutton31 = (Button) findViewById(R.id.button031);
        cbutton32 = (Button) findViewById(R.id.button032);

        tviewm = (TextView) findViewById(R.id.maintview);
        tviewm2 = (TextView) findViewById(R.id.maintview2);
        tview1 = (TextView) findViewById(R.id.tview1);
        tview2 = (TextView) findViewById(R.id.tview2);
        tview3 = (TextView) findViewById(R.id.tview3);
        tview4 = (TextView) findViewById(R.id.tview4);
        tview5 = (TextView) findViewById(R.id.tview5);
        tview6 = (TextView) findViewById(R.id.tview6);
        tview7 = (TextView) findViewById(R.id.tview7);
        tview8 = (TextView) findViewById(R.id.tview8);
        tview9 = (TextView) findViewById(R.id.tview9);
        tview10 = (TextView) findViewById(R.id.tview10);
        tview11 = (TextView) findViewById(R.id.tview11);
        tview12 = (TextView) findViewById(R.id.tview12);
        tview13 = (TextView) findViewById(R.id.tview13);
        tview14 = (TextView) findViewById(R.id.tview14);
        tview15 = (TextView) findViewById(R.id.tview15);
        tview16 = (TextView) findViewById(R.id.tview16);
        tview17 = (TextView) findViewById(R.id.tview17);
        tview18 = (TextView) findViewById(R.id.tview18);
        tview19 = (TextView) findViewById(R.id.tview19);
        tview20 = (TextView) findViewById(R.id.tview20);
        tview21 = (TextView) findViewById(R.id.tview21);
        tview22 = (TextView) findViewById(R.id.tview22);
        tview23 = (TextView) findViewById(R.id.tview23);
        tview24 = (TextView) findViewById(R.id.tview24);
        tview25 = (TextView) findViewById(R.id.tview25);
        tview26 = (TextView) findViewById(R.id.tview26);
        tview27 = (TextView) findViewById(R.id.tview27);
        tview28 = (TextView) findViewById(R.id.tview28);
        tview29 = (TextView) findViewById(R.id.tview29);
        tview30 = (TextView) findViewById(R.id.tview30);
        tview31 = (TextView) findViewById(R.id.tview31);
        tview32 = (TextView) findViewById(R.id.tview32);

        llayout1 = (LinearLayout) findViewById(R.id.LinearLayout1);
        llayout3 = (LinearLayout) findViewById(R.id.LinearLayout3);

        new myClass().execute("cad");

        button1.setOnClickListener(this);

        cbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("cad");
            }
        });

        cbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("usd");
            }
        });

        cbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("eur");
            }
        });

        cbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("gbp");
            }
        });

        cbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("jpy");
            }
        });

        cbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("cny");
            }
        });

        cbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("hkd");
            }
        });

        cbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("inr");
            }
        });

        cbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("rub");
            }
        });

        cbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("bgn");
            }
        });

        cbutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("czk");
            }
        });

        cbutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("dkk");
            }
        });

        cbutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("huf");
            }
        });

        cbutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("pln");
            }
        });

        cbutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("ron");
            }
        });

        cbutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("sek");
            }
        });

        cbutton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("chf");
            }
        });

        cbutton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("nok");
            }
        });

        cbutton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("try");
            }
        });

        cbutton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("aud");
            }
        });

        cbutton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("brl");
            }
        });
        cbutton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("idr");
            }
        });

        cbutton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("ils");
            }
        });

        cbutton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("krw");
            }
        });

        cbutton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("mxn");
            }
        });

        cbutton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("myr");
            }
        });
        cbutton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("nzd");
            }
        });

        cbutton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("php");
            }
        });

        cbutton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("sgd");
            }
        });

        cbutton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("thb");
            }
        });

        cbutton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("zar");
            }
        });

        cbutton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeMenu();
                new myClass().execute("hrk");
            }
        });

    }

    public void openMenu() {
        tviewm.setVisibility(View.INVISIBLE);
        tviewm2.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        llayout1.setVisibility(View.INVISIBLE);
        llayout3.setVisibility(View.VISIBLE);
    }

    public void closeMenu() {
        tviewm.setVisibility(View.VISIBLE);
        tviewm2.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        llayout1.setVisibility(View.VISIBLE);
        llayout3.setVisibility(View.INVISIBLE);
    }

    public void onClick(View v){
        openMenu();
    }

    public void changeTViewM(String s) {
        tviewm.setText(s);
    }

    public void changeTViewText() {
        tview1.setText("CAD : "+currencyValuesFinal[17]);
        tview2.setText("USD : "+currencyValuesFinal[0]);
        tview3.setText("EUR : " + currencyValuesFinal[31]);
        tview4.setText("GBP : " + currencyValuesFinal[5]);
        tview5.setText("JPY : "+currencyValuesFinal[1]);
        tview6.setText("CNY : "+currencyValuesFinal[18]);
        tview7.setText("HKD : "+currencyValuesFinal[19]);
        tview8.setText("INR : "+currencyValuesFinal[20]);
        tview9.setText("RUB : "+currencyValuesFinal[13]);
        tview10.setText("BGN : "+currencyValuesFinal[2]);
        tview11.setText("CZK : "+currencyValuesFinal[3]);
        tview12.setText("DKK : "+currencyValuesFinal[4]);
        tview13.setText("HUF : " + currencyValuesFinal[6]);
        tview14.setText("PLN : " + currencyValuesFinal[7]);
        tview15.setText("RON : "+currencyValuesFinal[8]);
        tview16.setText("SEK : "+currencyValuesFinal[9]);
        tview17.setText("CHF : "+currencyValuesFinal[10]);
        tview18.setText("NOK : "+currencyValuesFinal[11]);
        tview19.setText("TRY : "+currencyValuesFinal[14]);
        tview20.setText("AUD : "+currencyValuesFinal[15]);
        tview21.setText("BRL : "+currencyValuesFinal[16]);
        tview22.setText("IDR : "+currencyValuesFinal[20]);
        tview23.setText("ILS : " + currencyValuesFinal[21]);
        tview24.setText("KRW : " + currencyValuesFinal[23]);
        tview25.setText("MXN : "+currencyValuesFinal[24]);
        tview26.setText("MYR : "+currencyValuesFinal[25]);
        tview27.setText("NZD : "+currencyValuesFinal[26]);
        tview28.setText("PHP : "+currencyValuesFinal[27]);
        tview29.setText("SGD : "+currencyValuesFinal[28]);
        tview30.setText("THB : "+currencyValuesFinal[29]);
        tview31.setText("ZAR : "+currencyValuesFinal[30]);
        tview32.setText("HRK : " + currencyValuesFinal[12]);
    }

    public class myClass extends AsyncTask<String, Void, String> {

        public String[] temp = {"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","1"};

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }

        @Override
        protected String doInBackground(String... params) {

            try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName("Cube");
                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);
                    Element eElement = (Element) nNode;
                    for (int j = 0; j < temp.length; j++) {
                        if (eElement.getAttribute("currency").equalsIgnoreCase(currencyNames[j])) {
                            temp[j] = eElement.getAttribute("rate");
                        }
                    }
                }

            } catch (Exception e) {
            }
            return params[0];
        }

        @Override
        protected void onPostExecute(String country) {
            currencyValuesBase = temp;
            CurrencyTool euroTool = new CurrencyTool(country, currencyValuesBase);
            currencyValuesFinal = euroTool.returnFinalArray();
            changeTViewM("1 " + country.toUpperCase());
            changeTViewText();
        }
    }
}
