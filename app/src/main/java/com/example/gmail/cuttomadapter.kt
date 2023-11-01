package com.example.gmail

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class cuttomadapter (var context : Context , var mangmail : ArrayList<mail> ) : BaseAdapter() {
    class ViewHolder(row : View) {
        var textviewtenmail : TextView
        var imageviewmail : ImageView

        init{
            textviewtenmail = row.findViewById(R.id.textviewtenmail) as TextView
            imageviewmail = row.findViewById(R.id.imageviewmail) as ImageView

        }
    }
    override fun getCount(): Int {
        return mangmail.size
    }

    override fun getItem(position: Int): Any {
        return mangmail.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if(convertView==null){
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.dong_mail, null)
            viewHolder = ViewHolder(view)
            view.tag=viewHolder
        } else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var mail : mail = getItem(position) as mail
        viewHolder.textviewtenmail.text=mail.ten
        viewHolder.imageviewmail.setImageResource(mail.hinhanh)
        return view as View

    }

}