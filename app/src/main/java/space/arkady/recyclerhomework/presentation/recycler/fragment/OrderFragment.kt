package space.arkady.recyclerhomework.presentation.recycler.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_order.*
import kotlinx.android.synthetic.main.item.*
import kotlinx.android.synthetic.main.item.view.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.domain.domain.models.Brand
import space.arkady.recyclerhomework.presentation.recycler.viewmodel.SharedViewModel

class OrderFragment: Fragment(R.layout.fragment_order) {

    companion object {
        const val TAG = "Order"
        fun newInstance() = OrderFragment()
    }

    private val sharedViewModel: SharedViewModel by sharedViewModel()

    @SuppressLint("setTextI18N")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel.user.observe(viewLifecycleOwner) { user ->
            outputNameSecondName.text ="${user.name} ${user.secondName}"
            outputPhoneNumber.text = user.phone
        }

        sharedViewModel.setGraphicCard(Brand.NVIDIA, Brand.MACOS).observe(viewLifecycleOwner) { graphicCard ->
            outputGraphicCard.text = graphicCard
        }
        sharedViewModel.monitor.observe(viewLifecycleOwner) { monitor ->
            outputMonitor.setText(Brand.GIGABYTE, Brand.DELL)
        }
    }
}