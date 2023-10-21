package com.smartherd.diabetessystem.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.smartherd.diabetessystem.R
import kotlinx.android.synthetic.main.activity_predict_diabetes_page.*

class PredictDiabetesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_predict_diabetes_page)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setUpActionBar()
        btn_predict.setOnClickListener {
            cv_enter_data.visibility = View.GONE
            cv_prediction_result.visibility = View.VISIBLE
        }
    }

    private fun setUpActionBar() {
        setSupportActionBar(toolbar_predict_diabetes)
        val actionBar = supportActionBar
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        }
        toolbar_predict_diabetes.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}