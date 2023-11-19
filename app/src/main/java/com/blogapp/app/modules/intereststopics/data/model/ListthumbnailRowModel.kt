package com.blogapp.app.modules.intereststopics.`data`.model

import com.blogapp.app.R
import com.blogapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListthumbnailRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
