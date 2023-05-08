package com.example.counter

import android.graphics.ColorSpace

class Injector {
    companion object{

        fun getPresenter():Presenter{
            return Presenter()
        }
        fun getModel(): ColorSpace.Model {
            return ColorSpace.Model()
        }
    }}
