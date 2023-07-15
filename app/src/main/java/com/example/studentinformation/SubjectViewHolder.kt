package com.example.studentinformation

import androidx.recyclerview.widget.RecyclerView
import com.example.studentinformation.databinding.SubjectLayoutBinding

class SubjectViewHolder(private val binding:SubjectLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(subject:Subject){
        binding.imgViewProfessor.setImageResource(subject.professorImage)
        binding.txtViewProfessorName.text="Professor Name: ${subject.professorName}"
        binding.txtViewSubjectName.text ="Subject: ${subject.subjectName}"
        binding.txtViewSchedule.text="Schedule: ${subject.schedule}"

    }
}