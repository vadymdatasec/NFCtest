public class com.google.android.material.bottomsheet.BottomSheetBehavior$c extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "c" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final Integer d;
/* # direct methods */
public static com.google.android.material.bottomsheet.BottomSheetBehavior$c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/a/c/l/a; */
/* invoke-direct {v0}, Le/f/a/c/l/a;-><init>()V */
return;
} // .end method
public com.google.android.material.bottomsheet.BottomSheetBehavior$c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
/* .line 2 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;->d:I */
return;
} // .end method
public com.google.android.material.bottomsheet.BottomSheetBehavior$c ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
/* .line 4 */
/* iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;->d:I */
return;
} // .end method
/* # virtual methods */
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
