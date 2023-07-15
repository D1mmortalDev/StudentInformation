package com.example.studentinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentinformation.databinding.ActivityMainBinding
import com.example.studentinformation.databinding.StudentLayoutBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var  subjectRecycleView: RecyclerView
    private lateinit var studentContainer:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        studentContainer = binding.studentContainer
        //create subjectList first
        val subjectList= createSubjectList()
        // Display the student view
        displayStudentView(subjectList)
        // Display the subject view- recycle view
        displaySubjectRecyclerView(subjectList)
    }
    private fun createSubjectList(): List<Subject> {
        return listOf(
            Subject("Mathematics", "MWF 8:00AM-9:00AM", R.drawable.teacher2, "Jonathan Lee"),
            Subject("Business Ads", "MWF 7:00AM-8:00AM", R.drawable.teacher1, "Imelda Realce"),
            Subject("Rizal's Life", "T-TH 3:00PM-5PM", R.drawable.teacher3, "Bea Sta Rosa"),
            Subject("Foreign Language-Nihonggo", "T-TH 10:00AM-11AM", R.drawable.teacher4, "Roelle Ramos"),
            Subject("Foreign Language-Deutsch", "T-TH 1:00PM-2PM", R.drawable.teacher5, "Janice Baustista"),
            Subject("Software Engineering", "T-TH 11:00AM-12:00PM", R.drawable.teacher6, "Charles de Lazo"),
            Subject("Mathematics", "MWF 8:00AM-9:00AM", R.drawable.teacher2, "Jonathan Lee"),
            Subject("Calculus", "MWF 7:00AM-8:00AM", R.drawable.teacher1, "Imelda Realce"),
            Subject("Algebra", "T-TH 3:00PM-5PM", R.drawable.teacher3, "Bea Sta Rosa"),
            Subject("Software Development Life Cycle", "T-TH 10:00AM-11AM", R.drawable.teacher4, "Roelle Ramos"),
            Subject("Agile", "T-TH 1:00PM-2PM", R.drawable.teacher5, "Janice Baustista"),
            Subject("Communications", "T-TH 11:00AM-12:00PM", R.drawable.teacher6, "Charles de Lazo")
        )
    }

    private fun displaySubjectRecyclerView(subjects: List<Subject>) {
        val subjectAdapter = SubjectAdapter(subjects)
        val subjectRecyclerView = binding.recycleViewStudentSubject
        subjectRecyclerView.adapter = subjectAdapter
    }
    private fun displayStudentView(subjectOne:List<Subject>) {
        val students = Student(R.drawable.student1, "Bernadette de Jesus", "15-01223", "Information Technology", "NW-E", "Fourth", subjectOne)
        val studentBinding = StudentLayoutBinding.inflate(layoutInflater)
        studentBinding.imgViewStudent.setImageResource(students.studentImg)
        studentBinding.txtViewStudentId.text ="Student ID: ${students.studentId}"
        studentBinding.txtViewStudentName.text="Fullname: ${students.studentName}"
        studentBinding.txtViewCourse.text="Course: ${students.studentCourse}"
        studentBinding.txtViewYear.text= "Year Level: ${students.studentYear}"
        studentBinding.txtViewSection.text = "Section: ${students.studentSection}"
        val studentView = studentBinding.root
        studentContainer.addView(studentView)


    }

}
