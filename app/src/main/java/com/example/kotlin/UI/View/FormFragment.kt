package com.example.kotlin.UI.View

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
import com.example.kotlin.UI.ViewModel.ViewModel
import com.example.kotlin.databinding.FragmentFormBinding

class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding
    /**LiveData 변수 생성*/
    private var _cancel = MutableLiveData<Event<Boolean>>()
    val cancel: LiveData<Event<Boolean>> = _cancel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var viewmodel = ViewModel()

        /**cancel, submit 버튼 이벤트 작성하기*/
        binding.cancelBtn.setOnClickListener {
            //_cancel.postValue(Event(true))
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.layout, ListFragment())
                .commit()
        }
        binding.submitBtn.setOnClickListener {
            //_submit.postValue(Event(true))
            /**뷰모델에게 할일,기한 데이터를 뽑아서 전달한다*/
            /**관찰하고 있는 뷰모델의 LiveData의 Observer*/
            viewmodel.submit.observe(viewLifecycleOwner, Observer {
                /**서버로 보낸 제출요청에 대한 응답이 성공인 것으로 확인됨. 따라서 메인화면으로 이동*/
                /**밑에 "새로운 TodoList항목이 성공적으로 추가되었습니다 토스트or 다이얼로그 띄우기"*/
                parentFragmentManager
                    .beginTransaction()
                    .replace(R.id.layout, ListFragment())
                    .commit()
            })
        }
    }
}