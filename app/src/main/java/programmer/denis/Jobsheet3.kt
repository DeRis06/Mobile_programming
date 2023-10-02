package programmer.denis
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Jobsheet3 : AppCompatActivity() {
    private lateinit var computerImageView: ImageView
    private lateinit var rockImageButton: ImageButton
    private lateinit var scissorsImageButton: ImageButton
    private lateinit var paperImageButton: ImageButton
    private lateinit var resultImageView: ImageView

    private fun initComponents() {
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.rockImageButton)
        scissorsImageButton = findViewById(R.id.scissorsImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    private fun initListeners() {
        rockImageButton.setOnClickListener { startGame("ROCK") }
        scissorsImageButton.setOnClickListener { startGame("SCISSORS") }
        paperImageButton.setOnClickListener { startGame("PAPER") }
    }
    private fun startGame(option: String) {
        val computerOption = Game.pickRandomOptinon()
        computerImageView.setImageResource(Game.pickDrawable(computerOption))
        when{
            Game.isDraw(option, computerOption) -> resultImageView.setImageResource(R.drawable.istockphoto)
            Game.isWin(option, computerOption) -> resultImageView.setImageResource(R.drawable.untitled2)
            else -> resultImageView.setImageResource(R.drawable.foto_kucing_menangis_0)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        initComponents()
        initListeners()
    }
}