package br.com.fiap.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SpashScreenActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 3500L

    lateinit var ivLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)

        ivLogo = findViewById(R.id.IvPokeBola)
        carregar()
    }
    fun  carregar(){
        val  anim = AnimationUtils.loadAnimation(this,R.anim.anim)
        anim.reset()

        ivLogo!!.clearAnimation()
        ivLogo!!.startAnimation(anim)

        Handler().postDelayed({
            val intent = Intent(this@SpashScreenActivity, GameActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            this@SpashScreenActivity.finish()
        }, SPLASH_DISPLAY_LENGTH)
    }
}
