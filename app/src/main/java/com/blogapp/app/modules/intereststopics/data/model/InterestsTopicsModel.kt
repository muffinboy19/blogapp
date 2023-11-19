package com.blogapp.app.modules.intereststopics.`data`.model

import com.blogapp.app.R
import com.blogapp.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopic: String? = MyApp.getInstance().resources.getString(R.string.lbl_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeople: String? = MyApp.getInstance().resources.getString(R.string.lbl_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPublication: String? = MyApp.getInstance().resources.getString(R.string.lbl_publication)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtEntertainment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arts_entertai)

)
