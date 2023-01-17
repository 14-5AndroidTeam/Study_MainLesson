package com.example.kotlin.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.kotlin.Event
import com.example.kotlin.R
import com.example.kotlin.ui.viewmodel.ListModel
import com.example.kotlin.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding:FragmentListBinding
    /**LiveData 변수 생성*/
    private var _form = MutableLiveData<Event<Boolean>>()
    val form: LiveData<Event<Boolean>> = _form

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        // Inflate the layout for 이ㄸthis fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**어댑터 등록하기*/
        var adapter = Adapter()
        binding.recyclerview.adapter = adapter
        /**뷰모델 등록하기*/
        var viewmodel = ListModel()
        viewmodel.getList()
        /**버튼 클릭 시 다음페이지 화면전환하기*/
        binding.button.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.layout, FormFragment())
                .commit()
        }
        /**뷰모델 옵저버*/
//        viewmodel.setList.observe(viewLifecycleOwner, Observer {
//            adapter.setList(it.peekContent().todos)
//            adapter.notifyItemRangeChanged(0,it.peekContent().total_post)
//        })
    }
}