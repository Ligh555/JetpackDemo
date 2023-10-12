package com.ligh.livecycle.core

import androidx.core.app.ComponentActivity
import androidx.lifecycle.Lifecycle

class UIControllerManager {

    private val mLifecycleRegistry  = LifecycleRegistryFactory.getLifecycleRegistry(ComponentActivity())
    fun add(uiController: UiController){
        mLifecycleRegistry.addObserver(uiController)
        mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
        mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
        mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
    }

    fun remove(uiController: UiController){
        mLifecycleRegistry.removeObserver(uiController)
        mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
        mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    }
}