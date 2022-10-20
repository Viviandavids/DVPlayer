package com.example.dvplayer

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.dvplayer.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.VideoView.id)
        //Creating the MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // Specify the location of the video file
        val uri: Uri = parse(
            "android.resource://$packageName/raw/rush"
        )

        // Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)

        // Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

    }


}