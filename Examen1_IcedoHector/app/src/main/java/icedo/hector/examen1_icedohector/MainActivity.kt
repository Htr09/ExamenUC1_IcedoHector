package icedo.hector.examen1_icedohector

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var nombre1: String
    lateinit var nombre2: String
    var compatibilidad: Float = 0.0f
    lateinit var mensaje: String

    val txtNombre1: EditText = findViewById(R.id.txtNombre1)
    val txtNombre2: EditText = findViewById(R.id.txtNombre2)
    val btnCalcular: Button = findViewById(R.id.btnCalcular)
    var tvPorcentaje : TextView = findViewById(R.id.tvPorcentaje)
    var tvMensaje: TextView = findViewById(R.id.tvMensaje)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        nombre1 = txtNombre1.toString()
        nombre2 = txtNombre2.toString()

        btnCalcular.setOnClickListener{
            verificarVocales(nombre1,nombre2)
            asignarMensajeyColor(compatibilidad)


        }


    }
    

    fun verificarVocales (nombre1: String, nombre2: String):Float{




        return compatibilidad
    }

    fun asignarMensajeyColor(compatibilidad: Float): Float{

        var porcentaje:Float =0.0f

        if(compatibilidad == 100.toFloat() || compatibilidad>=90){
            porcentaje = compatibilidad

            tvPorcentaje = porcentaje
            tvPorcentaje.setTextColor()
            tvMensaje ="Huele a boda!"

        }else if(compatibilidad >= 89 || compatibilidad <=75 ){
            porcentaje=compatibilidad
            tvPorcentaje = porcentaje
            tvPorcentaje.setTextColor()
            tvMensaje ="Hay quimica"
        }else if(compatibilidad >=74 || compatibilidad <=60){
            porcentaje = compatibilidad
            tvPorcentaje = porcentaje
            tvPorcentaje.setTextColor()
            tvMensaje ="Muy poca"
        }else if(compatibilidad<=59){
            porcentaje = compatibilidad
            tvPorcentaje = porcentaje
            tvPorcentaje.setTextColor()
            tvMensaje ="No hay"
        }



      return porcentaje


    }

}