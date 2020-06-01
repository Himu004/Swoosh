package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {

    }

    fun onWomenBtnCliked(view: View) {

    }

    fun onCoedClicked(view: View) {

    }

    fun leagueNextClicked(view: View) {
        val SkillActivity = Intent (this, SkillActivity::class.java)
        startActivity(SkillActivity)
    }


}