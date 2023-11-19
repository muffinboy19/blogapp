package com.blogapp.app.modules.interestspeople.`data`.model

import com.blogapp.app.R
import com.blogapp.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsPeopleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_see_all_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMorepeopletofollow: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_people_to)

)
