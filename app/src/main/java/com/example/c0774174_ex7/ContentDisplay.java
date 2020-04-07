package com.example.c0774174_ex7;

import android.os.Parcel;
import android.os.Parcelable;

public class ContentDisplay implements Parcelable
    {
        public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
            public ContentDisplay createFromParcel(Parcel in) {
                return new ContentDisplay(in);
            }

            public ContentDisplay[] newArray(int size) {
                return new ContentDisplay[size];
            }
        };

        private int studentId;
        private String studentName;
        private String desc;


        public ContentDisplay(int placeId,
                      String placeName, String desc, int placeImage) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.desc = desc;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }


        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }


        public ContentDisplay()
        {

        }
        // Parcelling part
        public ContentDisplay(Parcel in){
            this.studentName = in.readString();
            this.desc = in.readString();
            this.studentId =  in.readInt();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.studentName);
            dest.writeString(this.desc);
            dest.writeInt(this.studentId);

        }
        @Override
        public String toString() {
            return "Place Name='" + studentName + '\n' +
                    "Place Id='" + studentId + '\n' +
                    "Description ='" + desc + '\n'
                    ;
        }
    }

