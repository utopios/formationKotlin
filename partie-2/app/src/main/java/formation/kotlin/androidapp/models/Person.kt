package formation.kotlin.androidapp.models

import android.os.Parcel
import android.os.Parcelable

data class Person(var name:String?, var age:Int):Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString(), parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }
}