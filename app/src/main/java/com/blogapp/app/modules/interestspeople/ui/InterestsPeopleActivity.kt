package com.blogapp.app.modules.interestspeople.ui

import android.view.View
import androidx.activity.viewModels
import com.blogapp.app.R
import com.blogapp.app.appcomponents.base.BaseActivity
import com.blogapp.app.databinding.ActivityInterestsPeopleBinding
import com.blogapp.app.modules.interestspeople.`data`.model.ListprofilepictureRowModel
import com.blogapp.app.modules.interestspeople.`data`.viewmodel.InterestsPeopleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestsPeopleActivity :
    BaseActivity<ActivityInterestsPeopleBinding>(R.layout.activity_interests_people) {
  private val viewModel: InterestsPeopleVM by viewModels<InterestsPeopleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listprofilepictureAdapter =
    ListprofilepictureAdapter(viewModel.listprofilepictureList.value?:mutableListOf())
    binding.recyclerListprofilepicture.adapter = listprofilepictureAdapter
    listprofilepictureAdapter.setOnItemClickListener(
    object : ListprofilepictureAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListprofilepictureRowModel) {
        onClickRecyclerListprofilepicture(view, position, item)
      }
    }
    )
    viewModel.listprofilepictureList.observe(this) {
      listprofilepictureAdapter.updateData(it)
    }
    binding.interestsPeopleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprofilepicture(
    view: View,
    position: Int,
    item: ListprofilepictureRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INTERESTS_PEOPLE_ACTIVITY"

  }
}
