package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
    }

    fun displayContact() {

        val contact1 = ContactData("Mina Ritenberg", "", "254724638771", "minaiso@gmail.com")
        val contact2 = ContactData("Aniso Kilas", "", "254724638771", "kilasaniso@gmail.com")
        val contactList = listOf(contact1, contact2)
        val contactAdapter = ContactRvAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contactAdapter
    }
}
