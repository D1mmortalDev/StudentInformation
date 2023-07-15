package com.example.studentinformation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studentinformation.databinding.StudentLayoutBinding
import com.example.studentinformation.databinding.SubjectLayoutBinding

class SubjectAdapter(private val subjectList: List<Subject>):RecyclerView.Adapter<SubjectViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =  SubjectLayoutBinding.inflate(inflater,parent,false)
        return SubjectViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return subjectList.size
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        holder.bind(subjectList[position])
    }
}