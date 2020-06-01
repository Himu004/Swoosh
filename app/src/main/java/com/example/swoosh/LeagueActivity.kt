package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(view: View) {
        val SkillActivity = Intent (this, SkillActivity::class.java)
        startActivity(SkillActivity)
    }
}