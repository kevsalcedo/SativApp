package com.graymandev.sapp.view.stores

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.chetantuteja.easybinding.BindingFragment
import com.graymandev.sapp.R
import com.graymandev.sapp.databinding.FragmentCategoryCardsListBinding
import com.graymandev.sapp.databinding.FragmentStoresListBinding
import com.graymandev.sapp.view.main.CategoryCardAdapter
import com.graymandev.sapp.view.main.CategoryCardProvider

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StoresListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StoresListFragment : BindingFragment<FragmentStoresListBinding>() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    override fun init() {
        binding.recyclerViewStores.layoutManager = LinearLayoutManager(activity)
        binding.recyclerViewStores.adapter = StoresListAdapter(StoreProvider.storeList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentStoresListBinding {
        return FragmentStoresListBinding.inflate(inflater,container,false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StoresListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StoresListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}