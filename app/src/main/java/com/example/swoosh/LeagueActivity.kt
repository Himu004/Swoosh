package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomenBtnCliked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        selectedLeague = "coed"
    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val SkillActivity = Intent (this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(SkillActivity)
            mensLeagueBtn.isChecked = false
            womenLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false

            selectedLeague = ""
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }


    }


}