package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
       league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onBallerSkillClick(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }


    fun onSkillFinishClicked(view: View) {

        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            startActivity(finishActivity)
        }else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_LONG).show()
        }

    }

}