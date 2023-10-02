package programmer.denis
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.createSavedStateHandle

class activity_main : AppCompatActivity(), View.OnClickListener {
    private lateinit var inputTinggi: EditText
    private lateinit var btn: Button
    private lateinit var result: TextView
    private lateinit var inputLebar: EditText
    private lateinit var inputPanjang: EditText

    companion object{
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputTinggi = findViewById(R.id.edt_height)
        inputLebar = findViewById(R.id.edt_width)
        inputPanjang = findViewById(R.id.edt_length)
        btn = findViewById(R.id.btn_result)
        result = findViewById(R.id.result)

        btn.setOnClickListener(this)

        if(savedInstanceState != null){
            result.text = savedInstanceState.getString(STATE_RESULT)
        }
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_result) {
            var tinggi = inputTinggi.text.toString().trim()
            var lebar = inputLebar.text.toString().trim()
            var panjang = inputPanjang.text.toString().trim()
            var check = false
            if (lebar.isEmpty()) {
                check = true
                inputLebar.error = "Wajib diisi"
            }
            if (tinggi.isEmpty()) {
                check = true
                inputTinggi.error = "Wajib diisi"
            }
            if (panjang.isEmpty()) {
                check = true
                inputPanjang.error = "Wajib diisi"
            }
            if (!check) {
                var volume = tinggi.toDouble() * panjang.toDouble() * lebar.toDouble()
                result.text = volume.toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, result.text.toString())
    }
}