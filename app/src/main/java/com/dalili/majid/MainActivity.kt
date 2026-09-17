package com.dalili.majid
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val wilayas = listOf(
            "01 Adrar","02 Chlef","03 Laghouat","04 Oum El Bouaghi","05 Batna","06 Bejaia","07 Biskra","08 Bechar","09 Blida","10 Bouira",
            "11 Tamanrasset","12 Tebessa","13 Tlemcen","14 Tiaret","15 Tizi Ouzou","16 Alger","17 Djelfa","18 Jijel","19 Setif","20 Saida",
            "21 Skikda","22 Sidi Bel Abbes","23 Annaba","24 Guelma","25 Constantine","26 Medea","27 Mostaganem","28 M'Sila","29 Mascara","30 Ouargla",
            "31 Oran","32 El Bayadh","33 Illizi","34 Bordj Bou Arreridj","35 Boumerdes","36 El Tarf","37 Tindouf","38 Tissemsilt","39 El Oued","40 Khenchela",
            "41 Souk Ahras","42 Tipaza","43 Mila","44 Ain Defla","45 Naama","46 Ain Temouchent","47 Ghardaia","48 Relizane","49 Timimoun","50 Bordj Badji Mokhtar",
            "51 Ouled Djellal","52 Beni Abbes","53 In Salah","54 In Guezzam","55 Touggourt","56 Djanet","57 El M'Ghair","58 El Menia"
        )
        val tv = TextView(this)
        tv.text = wilayas.joinToString("\n")
        tv.textSize = 18f
        tv.setPadding(20,20,20,20)
        setContentView(tv)
    }
}
