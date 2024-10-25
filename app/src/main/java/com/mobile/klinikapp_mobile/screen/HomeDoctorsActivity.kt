package com.mobile.klinikapp_mobile.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobile.klinikapp_mobile.R
import com.mobile.klinikapp_mobile.adapter.ListDoctorsAdapter
import com.mobile.klinikapp_mobile.model.ModelListDoctors

class HomeDoctorsActivity : AppCompatActivity() {

    private var rv_list: RecyclerView? = null
    private var homeDoctorsAdapter: ListDoctorsAdapter? = null

    //array data doctor
    private var doctorList = mutableListOf<ModelListDoctors>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctors)

        rv_list = findViewById(R.id.rv_list_doctors)
        doctorList = ArrayList()
        homeDoctorsAdapter = ListDoctorsAdapter(this,doctorList);
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this,1)
        rv_list!!.layoutManager = layoutManager
        rv_list!!.adapter = homeDoctorsAdapter

        //create dummy data
        prepareDataDoctors()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun prepareDataDoctors(){
        var itemDoctors=ModelListDoctors(
            R.drawable.dokter1,
            "Rizki Syaputra",
            "Dentist",
            "120",
            "5.0"
        )
        doctorList.add(itemDoctors)
        itemDoctors=ModelListDoctors(
            R.drawable.dokter2,
            "Yahya Badrussalam",
            "Obgyn",
            "100",
            "5.0"

        )
        doctorList.add(itemDoctors)
        itemDoctors=ModelListDoctors(
            R.drawable.dokter3,
            "Dr Abdullan",
            "Obgyn",
            "100",
            "5.0"
        )
        doctorList.add(itemDoctors)
        itemDoctors=ModelListDoctors(
            R.drawable.dokter4,
            "Drs Rini Mardan",
            "Obgyn",
            "100",
            "5.0"
        )

        doctorList.add(itemDoctors)
        itemDoctors=ModelListDoctors(
            R.drawable.dokter5,
            "Drs Desvita Putri",
            "Dokter Umum",
            "100",
            "5.0"
        )
        doctorList.add(itemDoctors)
        homeDoctorsAdapter!!.notifyDataSetChanged()

    }

}