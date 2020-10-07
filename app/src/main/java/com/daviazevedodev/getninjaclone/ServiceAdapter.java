package com.daviazevedodev.getninjaclone;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daviazevedodev.getninjaclone.model.Service;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceViewHolder> {

    private final List<Service> services;

    public ServiceAdapter(List<Service> services) {
        this.services = services;
    }

    @NonNull
    @Override
    public ServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.solo_item, parent, false);
        return new ServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceViewHolder holder, int position) {
        Service service = services.get(position);
        holder.bind(service);
    }

    @Override
    public int getItemCount() {
        return services.size();
    }

    class ServiceViewHolder extends RecyclerView.ViewHolder {
        TextView txt_name_service;
        TextView txt_name_person;
        TextView txt_status;

        public ServiceViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name_service = itemView.findViewById(R.id.txt_nameService);
            txt_name_person = itemView.findViewById(R.id.txt_namePerson);
            txt_status = itemView.findViewById(R.id.txt_status);

        }




        public void bind(Service service) {
            txt_name_person.setText(service.getNamePerson());
            txt_name_service.setText(service.getNameService());
            txt_status.setText(service.getStatus());

        }

    }

}
