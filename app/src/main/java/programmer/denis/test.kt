package programmer.denis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class test : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var buttonButton: Button
    private lateinit var buttonTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        buttonButton = findViewById(R.id.buttonTombol)
        buttonTextView = findViewById(R.id.buttonTextView)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        initComponents()
        buttonTextView.text = resources.getString(R.string.app_name)
        buttonButton.setOnClickListener{
            val name = nameEditText.text.toString()
            buttonTextView.text = resources.getString(R.string.buttonTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN",it)
            }
        }
    }
}