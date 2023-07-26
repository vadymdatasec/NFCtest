public class com.google.android.material.appbar.AppBarLayout$BaseBehavior$c extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior; */
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
/* "Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer d;
public Float e;
public Boolean f;
/* # direct methods */
public static com.google.android.material.appbar.AppBarLayout$BaseBehavior$c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/a/c/k/a; */
/* invoke-direct {v0}, Le/f/a/c/k/a;-><init>()V */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$BaseBehavior$c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
/* .line 2 */
p2 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->d:I */
/* .line 3 */
p2 = (( android.os.Parcel ) p1 ).readFloat ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F
/* iput p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->e:F */
/* .line 4 */
p1 = (( android.os.Parcel ) p1 ).readByte ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->f:Z */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$BaseBehavior$c ( ) {
/* .locals 0 */
/* .line 5 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
/* iget p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->e:F */
(( android.os.Parcel ) p1 ).writeFloat ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V
/* .line 4 */
/* iget-boolean p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->f:Z */
/* int-to-byte p2, p2 */
(( android.os.Parcel ) p1 ).writeByte ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V
return;
} // .end method
