package space.arkady.recyclerhomework.presentation.recycler.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_graphiccard.*
import kotlinx.android.synthetic.main.fragment_monitor.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.domain.domain.models.Brand
import space.arkady.recyclerhomework.domain.domain.models.CommonItem
import space.arkady.recyclerhomework.presentation.recycler.ItemClickListener
import space.arkady.recyclerhomework.presentation.recycler.extensionFragment.openFragment
import space.arkady.recyclerhomework.presentation.recycler.extensionFragment.showToast
import space.arkady.recyclerhomework.presentation.recycler.viewmodel.SharedViewModel

class MonitorFragment : Fragment(R.layout.fragment_monitor) {

    companion object {
        const val TAG = "Monitor"
        fun newInstance() = MonitorFragment()
    }

    private val sharedViewModel: SharedViewModel by sharedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showMonitorList.setOnClickListener {
            DialogFragment.newInstance(getItem)
                .show(requireActivity().supportFragmentManager, (DialogFragment.TAG))
        }
        button_monitorToPeriphery.setOnClickListener {
            when {
                checkEmptyField() -> showToast("Select a monitor")
                showgraphicCardList.text.equals("LG") -> Brand.LG
                showgraphicCardList.text.equals("SAMSUNG") -> Brand.SAMSUNG
                showgraphicCardList.text.equals("ACER") -> Brand.ACER
                showgraphicCardList.text.equals("DELL") -> Brand.DELL
                showgraphicCardList.text.equals("GIGABYTE") -> Brand.GIGABYTE
            }
        }
        sharedViewModel.monitor.observe(viewLifecycleOwner) {
            requireActivity().apply {
                openFragment(R.id.container, PeripheryFragment.newInstance(), PeripheryFragment.TAG)
            }
        }
    }


    private fun checkEmptyField(): Boolean {
        return showMonitorList.text.isEmpty()
    }

    private val getItem = object : ItemClickListener {
        override fun itemClickListener(clickItem: CommonItem) {
            showMonitorList.setText(clickItem.item)
        }
    }
}