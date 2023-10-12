package com.ligh.livecycle.core

import androidx.activity.ComponentActivity

import androidx.lifecycle.LifecycleRegistry

object LifecycleRegistryFactory {
     fun getLifecycleRegistry(activity : ComponentActivity) = LifecycleRegistry(activity)
}