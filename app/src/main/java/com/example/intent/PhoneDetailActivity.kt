package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*
import kotlinx.android.synthetic.main.contact_list_item.*
import java.time.Instant

class PhoneDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartThisActivity = getIntent()

        if(intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var partId = intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            tv_item_id.text = partId
        }
    }
}