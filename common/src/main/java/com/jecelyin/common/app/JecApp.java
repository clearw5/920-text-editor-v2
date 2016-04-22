/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.common.app;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import android.util.Log;

import com.jecelyin.common.utils.L;
import com.jecelyin.common.utils.SysUtils;
import com.squareup.leakcanary.RefWatcher;
import com.squareup.leakcanary.LeakCanary;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class JecApp extends Application implements Thread.UncaughtExceptionHandler {
    private static Context context;
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        if (SysUtils.isDebug(this))
        {
            L.debug = true;
            //内存泄漏监控
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            builder.detectAll();
            builder.penaltyLog();
            StrictMode.setVmPolicy(builder.build());
        }
        // 捕捉未知异常
        Thread.setDefaultUncaughtExceptionHandler(this);
        refWatcher = LeakCanary.install(this);
    }

    @Override
    public void uncaughtException(Thread thread, final Throwable ex)
    {
        Log.e("uncaughtException", "#ERROR: " + ex.getMessage(), ex);

        CrashReportDialogActivity.startActivity(this, ex);

//        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public static RefWatcher getRefWatcher(Context context) {
        JecApp application = (JecApp) context.getApplicationContext();
        return application.refWatcher;
    }

    public static Context getContext() {
        return context;
    }
}