package com.project.vagabond95.mvp_dagger_android.view;

public interface MainContract {
    interface View {

    }

    interface Presenter {
        void setView(MainContract.View view);
    }
}
