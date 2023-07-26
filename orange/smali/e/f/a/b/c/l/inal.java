public class inal implements android.os.Parcelable$Creator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Lcom/google/android/gms/common/api/Status;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public inal ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public final java.lang.Object createFromParcel ( android.os.Parcel p0 ) { //synthethic
	 /* .locals 8 */
	 /* .line 1 */
	 v0 = 	 com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( p1 );
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 /* move-object v2, v1 */
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 2 */
} // :goto_0
v5 = (( android.os.Parcel ) p1 ).dataPosition ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
/* if-ge v5, v0, :cond_4 */
/* .line 3 */
v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p1 );
/* .line 4 */
v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( v5 );
int v7 = 1; // const/4 v7, 0x1
/* if-eq v6, v7, :cond_3 */
int v7 = 2; // const/4 v7, 0x2
/* if-eq v6, v7, :cond_2 */
int v7 = 3; // const/4 v7, 0x3
/* if-eq v6, v7, :cond_1 */
/* const/16 v7, 0x3e8 */
/* if-eq v6, v7, :cond_0 */
/* .line 5 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .j ( p1,v5 );
/* .line 6 */
} // :cond_0
v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .g ( p1,v5 );
/* .line 7 */
} // :cond_1
v2 = android.app.PendingIntent.CREATOR;
/* .line 8 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p1,v5,v2 );
/* check-cast v2, Landroid/app/PendingIntent; */
/* .line 9 */
} // :cond_2
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( p1,v5 );
/* .line 10 */
} // :cond_3
v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .g ( p1,v5 );
/* .line 11 */
} // :cond_4
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .d ( p1,v0 );
/* .line 12 */
/* new-instance p1, Lcom/google/android/gms/common/api/Status; */
/* invoke-direct {p1, v3, v4, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(IILjava/lang/String;Landroid/app/PendingIntent;)V */
} // .end method
public final java.lang.Object newArray ( Integer p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* new-array p1, p1, [Lcom/google/android/gms/common/api/Status; */
} // .end method
