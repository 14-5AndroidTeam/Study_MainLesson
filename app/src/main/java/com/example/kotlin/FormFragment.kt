package com.example.kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlin.databinding.FragmentFormBinding

class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding
    /**LiveData 변수 생성*/
    private var _cancel = MutableLiveData<Event<Boolean>>()
    val cancel: LiveData<Event<Boolean>> = _cancel
    private var _submit = MutableLiveData<Event<Boolean>>()
    val submit: LiveData<Event<Boolean>> = _submit

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
        /**cancel, submit 버튼 이벤트 작성하기*/
        binding.cancelBtn.setOnClickListener {
            _cancel.postValue(Event(true))
        }
        binding.submitBtn.setOnClickListener {
            _submit.postValue(Event(true))
        }
    }
}