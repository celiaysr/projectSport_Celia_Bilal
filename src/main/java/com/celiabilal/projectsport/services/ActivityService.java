package com.celiabilal.projectsport.services;

import com.celiabilal.projectsport.entities.Activity;
import com.celiabilal.projectsport.repositories.ActivityRepositoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    private final ActivityRepositoryBean activityRepository;

    @Autowired
    public ActivityService(ActivityRepositoryBean activityRepository) {
        this.activityRepository = activityRepository;
    }

    public Iterable<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public Activity getActivityById(Integer id) {
        return activityRepository.findById(id).orElse(null);
    }

    public Activity saveActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public void deleteActivity(Integer id) {
        activityRepository.deleteById(id);
    }

}
