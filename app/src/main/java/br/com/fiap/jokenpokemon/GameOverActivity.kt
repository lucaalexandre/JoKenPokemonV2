package br.com.fiap.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameOverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        val jogarNovamenteBt = findViewById<Button>(R.id.BtJogarNovamente)
        val MenuBt = findViewById<Button>(R.id.BtMenu)


        MenuBt.setOnClickListener{
            val intent = Intent(this@GameOverActivity,GameActivity::class.java)
            startActivity(intent)
        }



    }
}
