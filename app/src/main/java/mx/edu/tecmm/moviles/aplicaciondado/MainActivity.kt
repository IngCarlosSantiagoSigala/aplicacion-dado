package mx.edu.tecmm.moviles.aplicaciondado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import java.util.concurrent.ThreadLocalRandom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado: ImageView = findViewById(R.id.imvDado);
        val numerodado: TextView = findViewById(R.id.txtNumero);
        val botongirar : Button = findViewById(R.id.btnGirar)
        val random = Random()

        botongirar.setOnClickListener {
            numerodado.text =  random.nextInt(1..7).toString();
            if ((numerodado.text as String).toInt()== 2){
                dado.setImageResource(R.mipmap.dice_2);
            } else if ((numerodado.text as String).toInt() == 3){
                dado.setImageResource(R.mipmap.dice_3);
            } else if ((numerodado.text as String).toInt() == 4){
                dado.setImageResource(R.mipmap.dice_4);
            } else if ((numerodado.text as String).toInt() == 5){
                dado.setImageResource(R.mipmap.dice_5);
            } else if ((numerodado.text as String).toInt() == 6){
                dado.setImageResource(R.mipmap.dice_6);
            } else if ((numerodado.text as String).toInt() == 1){
                dado.setImageResource(R.mipmap.dice_1);
            }
        }
    }
}

fun Random.nextInt(range: IntRange): Int {
    return range.start + nextInt(range.last - range.start)
}




