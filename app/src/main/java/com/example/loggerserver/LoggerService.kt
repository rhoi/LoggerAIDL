package com.example.loggerserver

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.example.LoggerAIDL

class LoggerService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return object : LoggerAIDL.Stub(), IBinder {
            override fun log(msg: String): String {
                val res = "Hello World from server!" + msg
                Log.d("Logger Server", res)
                return res
            }
        }
    }
}
