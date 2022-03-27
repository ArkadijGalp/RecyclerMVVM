package space.arkady.recyclerhomework.presentation.recycler.fragment


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_graphiccard.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import space.arkady.recyclerhomework.R
import space.arkady.recyclerhomework.domain.domain.models.BrandGraphicCard
import space.arkady.recyclerhomework.domain.domain.models.CommonItem
import space.arkady.recyclerhomework.presentation.recycler.ItemClickListener
import space.arkady.recyclerhomework.presentation.recycler.extensionFragment.openFragment
import space.arkady.recyclerhomework.presentation.recycler.extensionFragment.showToast
import space.arkady.recyclerhomework.presentation.recycler.viewmodel.SharedViewModel


class GraphicCardFragment : Fragment(R.layout.fragment_graphiccard) {

    companion object {
        const val TAG = "GraphicCard"
        fun newInstance() = GraphicCardFragment()
    }

    private val sharedViewModel: SharedViewModel by sharedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showgraphicCardList.setOnClickListener {
            DialogFragment.newInstance(getItem)
                .show(requireActivity().supportFragmentManager, DialogFragment.TAG)
        }

        button_GraphicCardToMonitor.setOnClickListener {
            when {
                checkEmptyField() -> showToast("Select Graphic Card")
                showgraphicCardList.text.equals("NVIDIA") -> BrandGraphicCard.NVIDIA
                showgraphicCardList.text.equals("AMD") -> BrandGraphicCard.AMD
            }
        }

        sharedViewModel.graphicCard.observe(viewLifecycleOwner) {
            requireActivity().apply {
                openFragment(R.id.container, MonitorFragment.newInstance(), MonitorFragment.TAG)
            }
        }
    }

    private fun checkEmptyField(): Boolean {
        return showgraphicCardList.text.isEmpty()
    }

    private val getItem = object : ItemClickListener {
        override fun itemClickListener(itemClick: CommonItem) {
            showgraphicCardList.setText(itemClick.item)
        }
    }
}
