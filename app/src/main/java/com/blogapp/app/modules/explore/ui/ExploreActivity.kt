package com.blogapp.app.modules.explore.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.blogapp.app.R
import com.blogapp.app.appcomponents.base.BaseActivity
import com.blogapp.app.databinding.ActivityExploreBinding
import com.blogapp.app.modules.explore.`data`.model.ExploreRowModel
import com.blogapp.app.modules.explore.`data`.viewmodel.ExploreVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreActivity : BaseActivity<ActivityExploreBinding>(R.layout.activity_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val exploreAdapter = ExploreAdapter(viewModel.exploreList.value?:mutableListOf())
    binding.recyclerExplore.adapter = exploreAdapter
    exploreAdapter.setOnItemClickListener(
    object : ExploreAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExploreRowModel) {
        onClickRecyclerExplore(view, position, item)
      }
    }
    )
    viewModel.exploreList.observe(this) {
      exploreAdapter.updateData(it)
    }
    binding.exploreVM = viewModel
    setUpSearchViewSerachboxListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerExplore(
    view: View,
    position: Int,
    item: ExploreRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSerachboxListener(): Unit {
    binding.searchViewSerachbox.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "EXPLORE_ACTIVITY"

    }
  }
