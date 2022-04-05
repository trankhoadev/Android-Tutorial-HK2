package com.example.excercise7.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.R;
import com.example.excercise7.model.ContactModel;
import java.util.List;


public class ContactAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<ContactModel> contacts;

    public ContactAdapter(Context context, int idLayout, List<ContactModel> contacts) {
        this.context = context;
        this.idLayout = idLayout;
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        if (contacts.size() != 0) {
            return contacts.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        TextView name = (TextView) view.findViewById(R.id.textView);
        ContactModel contact = contacts.get(position);
        name.setText(contact.getName());
        return view;
    }
}
