package agilecontent.com.constraintdojo

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val imageList = listOf(R.drawable.ic_sentiment_dissatisfied_black_24dp, R.drawable.ic_sentiment_very_dissatisfied_black_24dp,
            R.drawable.ic_sentiment_very_satisfied_black_24dp, R.drawable.ic_insert_emoticon_black_24dp, R.drawable.ic_face_black_24dp)
    private val playerList = listOf("Ronaldo", "David Beckham", "Pelé", "Nathaniel Mendez-Laing", "Bradley Wright-Phillips")
    private val localList = listOf("Maracanã", "Camp Nou", "La bombonera")
    private val timeList = listOf("21:45", "18:00", "19:00")
    private val statsList = listOf("Chutes", "Chutes a Gol", "Defesas", "Cartões amarelos", "Escanteios")
    private val scoreList = 0..7
    private val possessionList = 30..70

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupValues()
    }

    private fun setupValues() {
        fab?.setOnClickListener { setupValues() }
        avatar1?.setImageDrawable(ContextCompat.getDrawable(this, imageList.random()!!))
        avatar2?.setImageDrawable(ContextCompat.getDrawable(this, imageList.random()!!))
        score1?.text = scoreList.random().toString()
        score2?.text = scoreList.random().toString()
        time2?.text = timeList.random()
        local2?.text = localList.random()
        stat2_title?.text = statsList.random().toString()
        stat1_title?.text = statsList.random().toString()
        stat3_title?.text = statsList.random().toString()
        stat2_value?.text = scoreList.random().toString()
        stat1_value?.text = scoreList.random().toString()
        stat3_value?.text = scoreList.random().toString()
        player_name1?.text = playerList.random()
//        player_name2?.text = playerList.random()
//        player_name3?.text = playerList.random()
        more_button?.setOnClickListener {
            Toast.makeText(this, "Veja mais", Toast.LENGTH_SHORT).show()
        }
    }

    private fun ClosedRange<Int>.random() =
            Random().nextInt((endInclusive + 1) - start) + start

    private fun <E> List<E>.random(): E? = if (size > 0) get(Random().nextInt(size)) else null

}
