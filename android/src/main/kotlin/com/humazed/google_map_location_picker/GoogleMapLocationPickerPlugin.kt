package com.humazed.google_map_location_picker

import android.app.Activity
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.annotation.UiThread
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar
import java.math.BigInteger
import java.security.MessageDigest


class GoogleMapLocationPickerPlugin(act: Activity?) : MethodCallHandler {
    var activity: Activity? = act

    companion object {
        @JvmStatic
        fun registerWith(registrar: Registrar) {
            val channel = MethodChannel(registrar.messenger(), "google_map_location_picker")
            channel.setMethodCallHandler(GoogleMapLocationPickerPlugin(registrar.activity()))
        }
    }

    @UiThread
    override fun onMethodCall(call: MethodCall, result: Result) {
    
    }
}
