package com.example.studentinformation

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.studentinformation.databinding.StudentLayoutBinding

class StudentViewHolder(private val binding:StudentLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(student:Student){
        binding.imgViewStudent.setImageResource(student.studentImg)
        binding.txtViewStudentId.text = student.studentId
        binding.txtViewStudentName.text= student.studentName
        binding.txtViewCourse.text= student.studentCourse
        binding.txtViewYear.text = student.studentYear
        binding.txtViewSection.text = student.studentSection

    }
}