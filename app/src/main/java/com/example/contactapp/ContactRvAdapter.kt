package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactapp.databinding.ContactItemListBinding

class ContactRvAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
     val binding = ContactItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList.get(position)
        val binding = holder.binding
//        binding.ivContactImage.text=currentContact.avatar
        binding.tvText1.text = currentContact.name
        binding.tvText2.text = currentContact.number
        binding.tvText3.text = currentContact.email


    }

}

class ContactViewHolder(var binding:ContactItemListBinding):ViewHolder(binding.root){

}