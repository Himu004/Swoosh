package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomenBtnCliked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        player.league = "coed"
    }


    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val SkillActivity = Intent (this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(SkillActivity)

        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }


    }


}