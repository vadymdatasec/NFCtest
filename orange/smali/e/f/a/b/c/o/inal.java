public class inal implements android.os.Parcelable$Creator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Lcom/google/android/gms/common/stats/WakeLockEvent;", */
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
	 /* .locals 26 */
	 /* move-object/from16 v0, p1 */
	 /* .line 1 */
	 v1 = 	 /* invoke-static/range {p1 ..p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->b(Landroid/os/Parcel;)I */
	 /* const-wide/16 v2, 0x0 */
	 int v4 = 0; // const/4 v4, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* move-wide v9, v2 */
	 /* move-wide/from16 v16, v9 */
	 /* move-wide/from16 v22, v16 */
	 /* move-object v12, v5 */
	 /* move-object v14, v12 */
	 /* move-object v15, v14 */
	 /* move-object/from16 v19, v15 */
	 /* move-object/from16 v20, v19 */
	 /* move-object/from16 v24, v20 */
	 int v8 = 0; // const/4 v8, 0x0
	 int v11 = 0; // const/4 v11, 0x0
	 int v13 = 0; // const/4 v13, 0x0
	 /* const/16 v18, 0x0 */
	 /* const/16 v21, 0x0 */
	 /* const/16 v25, 0x0 */
	 /* .line 2 */
} // :goto_0
v2 = /* invoke-virtual/range {p1 ..p1}, Landroid/os/Parcel;->dataPosition()I */
/* if-ge v2, v1, :cond_0 */
/* .line 3 */
v2 = /* invoke-static/range {p1 ..p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->a(Landroid/os/Parcel;)I */
/* .line 4 */
v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( v2 );
/* packed-switch v3, :pswitch_data_0 */
/* .line 5 */
/* :pswitch_0 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .j ( v0,v2 );
/* .line 6 */
/* :pswitch_1 */
v25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .e ( v0,v2 );
/* .line 7 */
/* :pswitch_2 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( v0,v2 );
/* .line 8 */
/* :pswitch_3 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .h ( v0,v2 );
/* move-result-wide v22 */
/* .line 9 */
/* :pswitch_4 */
v21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .f ( v0,v2 );
/* .line 10 */
/* :pswitch_5 */
v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .g ( v0,v2 );
/* .line 11 */
/* :pswitch_6 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( v0,v2 );
/* .line 12 */
/* :pswitch_7 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( v0,v2 );
/* .line 13 */
/* :pswitch_8 */
v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .g ( v0,v2 );
/* .line 14 */
/* :pswitch_9 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( v0,v2 );
/* .line 15 */
/* :pswitch_a */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .h ( v0,v2 );
/* move-result-wide v16 */
/* .line 16 */
/* :pswitch_b */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .c ( v0,v2 );
/* .line 17 */
/* :pswitch_c */
v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .g ( v0,v2 );
/* .line 18 */
/* :pswitch_d */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( v0,v2 );
/* .line 19 */
/* :pswitch_e */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .h ( v0,v2 );
/* move-result-wide v9 */
/* .line 20 */
/* :pswitch_f */
v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .g ( v0,v2 );
/* .line 21 */
} // :cond_0
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .d ( v0,v1 );
/* .line 22 */
/* new-instance v0, Lcom/google/android/gms/common/stats/WakeLockEvent; */
/* move-object v7, v0 */
/* invoke-direct/range {v7 ..v25}, Lcom/google/android/gms/common/stats/WakeLockEvent;-><init>(IJILjava/lang/String;ILjava/util/List;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;FJLjava/lang/String;Z)V */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_f */
/* :pswitch_e */
/* :pswitch_0 */
/* :pswitch_d */
/* :pswitch_c */
/* :pswitch_b */
/* :pswitch_0 */
/* :pswitch_a */
/* :pswitch_0 */
/* :pswitch_9 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public final java.lang.Object newArray ( Integer p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* new-array p1, p1, [Lcom/google/android/gms/common/stats/WakeLockEvent; */
} // .end method
