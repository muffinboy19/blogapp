package com.blogapp.app.modules.intereststopics.ui

import android.view.View
import androidx.activity.viewModels
import com.blogapp.app.R
import com.blogapp.app.appcomponents.base.BaseActivity
import com.blogapp.app.databinding.ActivityInterestsTopicsBinding
import com.blogapp.app.modules.intereststopics.`data`.model.ListthumbnailRowModel
import com.blogapp.app.modules.intereststopics.`data`.viewmodel.InterestsTopicsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InterestsTopicsActivity :
    BaseActivity<ActivityInterestsTopicsBinding>(R.layout.activity_interests_topics) {
  private val viewModel: InterestsTopicsVM by viewModels<InterestsTopicsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listthumbnailAdapter =
    ListthumbnailAdapter(viewModel.listthumbnailList.value?:mutableListOf())
    binding.recyclerListthumbnail.adapter = listthumbnailAdapter
    listthumbnailAdapter.setOnItemClickListener(
    object : ListthumbnailAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListthumbnailRowModel) {
        onClickRecyclerListthumbnail(view, position, item)
      }
    }
    )
    viewModel.listthumbnailList.observe(this) {
      listthumbnailAdapter.updateData(it)
    }
    binding.interestsTopicsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListthumbnail(
    view: View,
    position: Int,
    item: ListthumbnailRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INTERESTS_TOPICS_ACTIVITY"

  }
}
