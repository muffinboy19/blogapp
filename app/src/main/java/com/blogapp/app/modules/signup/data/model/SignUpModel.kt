package com.blogapp.app.modules.signup.`data`.model

import com.blogapp.app.R
import com.blogapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.lbl_register_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithGoogle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithFacebook: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithTwitter: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_tw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithAppleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_by_signing_up)

)
