package programmer.denis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val buttonTombol: Button = findViewById(R.id.buttonTombol)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text = "Halo"

        buttonTombol.setOnClickListener{
            val name = nameEditText.text.toString()
            buttonTextView.text = "Halo $name"
        }
    }
}