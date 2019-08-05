package com.ruzhan.movie.detail.adapter.holder

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.text.TextUtils
import android.view.View
import com.lion.font.FontHelper
import com.lion.imageloader.glide.ImageLoader
import com.ruzhan.lion.listener.OnItemClickListener
import com.ruzhan.lion.model.Video
import com.ruzhan.lion.util.ViewUtils
import com.ruzhan.movie.R
import kotlinx.android.synthetic.main.lion_item_movie_detail_video.view.*

class MovieDetailVideoHolder(itemView: View, listener: OnItemClickListener<Video>?) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

    private lateinit var video: Video

    init {
        itemView.play_count_tv.typeface = FontHelper.get().getLightTypeface()
        itemView.title_tv.typeface = FontHelper.get().getLightTypeface()
        if (listener != null) {
            itemView.root_cl.setOnClickListener { listener.onItemClick(adapterPosition, video, it) }
        }
    }

    fun bind(bean: Video) {
        video = bean
        itemView.title_tv.text = bean.title
        itemView.play_count_tv.background = if (TextUtils.isEmpty(bean.playNumberDesc)) {
            null
        } else {
            ContextCompat.getDrawable(itemView.context, R.drawable.shape_blue_radius_bg)
        }
        itemView.play_count_tv.text = bean.playNumberDesc
        ImageLoader.get().load(itemView.image_iv, bean.image,
                ViewUtils.getPlaceholder(itemView.context, adapterPosition))

    }
}