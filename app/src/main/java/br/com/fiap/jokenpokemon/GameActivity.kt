package br.com.fiap.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

     val jogarBtn = findViewById<Button>(R.id.BtJogar)
     val sobreBtn = findViewById<Button>(R.id.BtSobre)
     val rankBtn = findViewById<Button>(R.id.BtRanking)
     val sairBtn = findViewById<Button>(R.id.BtSair)

        jogarBtn.setOnClickListener{
            val intent = Intent(this@GameActivity,Tela1Activity::class.java)
            startActivity(intent)
        }

        sobreBtn.setOnClickListener{
            val intent = Intent(this@GameActivity,SobreActivity::class.java)
            startActivity(intent)
        }

        rankBtn.setOnClickListener{
            val intent = Intent(this@GameActivity,RankingActivity::class.java)
            startActivity(intent)
        }

        sairBtn.setOnClickListener{
            finish()
        }

    }

}
