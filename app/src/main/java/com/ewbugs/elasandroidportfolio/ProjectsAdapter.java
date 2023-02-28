package com.ewbugs.elasandroidportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

//The 'ViewHolder' will be the class which will hold our individual items and remembers all the views ('text view', 'image view')
public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);



    }

    //static means you don't have to have an object or a new instance to access the class.
    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        ImageView appImage;
        TextView appTitle;
        TextView appDescription;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_project_title);
            appDescription = itemView.findViewById(R.id.text_view_project_description);
        }

        public void bind(Project project){
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }

    }

}
