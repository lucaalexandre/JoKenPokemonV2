package br.com.fiap.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_tela1.*
import java.util.*

class Tela1Activity : AppCompatActivity() {

    private var numeroAleatorio: Random? = null

    private val CHARIZARD = 1
    private val BLASTOISE = 2
    private val VENUSAUR = 3




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        numeroAleatorio = Random()

        Btcharizand.setOnClickListener {
            IvJogadaPlayer!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.charizard))
            realizarJogada(CHARIZARD)
        }
        Btblastoise.setOnClickListener {
            IvJogadaPlayer!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bastoise))
            realizarJogada(BLASTOISE)
        }
        Btvenusaur.setOnClickListener {
            IvJogadaPlayer!!.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.venusaur))
            realizarJogada(VENUSAUR)
        }

    }
    private fun realizarJogada(jogadaPlayer: Int){
       val jogadaPC = numeroAleatorio!!.nextInt(3) + 1

        when(jogadaPC){
            CHARIZARD ->{
                IvJogadaIA!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.charizard))
                when(jogadaPlayer){
                    VENUSAUR-> venceu()
                    CHARIZARD -> empatou()
                    BLASTOISE -> perdeu()
                }
            }

            VENUSAUR ->{
                IvJogadaIA!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.charizard))
                when(jogadaPlayer){
                    VENUSAUR-> empatou()
                    CHARIZARD -> perdeu()
                    BLASTOISE -> venceu()
                }
            }

            BLASTOISE ->{
                IvJogadaIA!!.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.charizard))
                when(jogadaPlayer){
                    VENUSAUR-> perdeu()
                    CHARIZARD -> venceu()
                    BLASTOISE -> empatou()
                }
            }

        }
    }
    private fun venceu(){

    }
    private  fun  perdeu(){
        val intent = Intent(this@Tela1Activity,GameOverActivity::class.java)
        startActivity(intent)

    }
    private fun empatou(){

    }
}
