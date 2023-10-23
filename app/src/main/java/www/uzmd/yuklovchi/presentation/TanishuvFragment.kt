package www.uzmd.yuklovchi.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import www.uzmd.yuklovchi.R
import www.uzmd.yuklovchi.databinding.FragmentTanishuvBinding


class TanishuvFragment : Fragment() {
    private var _binding: FragmentTanishuvBinding? = null
    private val binding: FragmentTanishuvBinding
        get() = _binding ?: throw RuntimeException("Tanishuv fragmentida binding null keldi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentTanishuvBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            boshlashBtn.setOnClickListener {
                findNavController().navigate(R.id.action_tanishuvFragment_to_mainFragment)

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {


    }
}