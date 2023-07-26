public class androidx.recyclerview.widget.RecyclerView$y extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "y" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/recyclerview/widget/RecyclerView$y;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public android.os.Parcelable d;
/* # direct methods */
public static androidx.recyclerview.widget.RecyclerView$y ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/r/d/h0; */
/* invoke-direct {v0}, Lc/r/d/h0;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.RecyclerView$y ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
} // :cond_0
/* const-class p2, Landroidx/recyclerview/widget/RecyclerView$o; */
/* .line 3 */
(( java.lang.Class ) p2 ).getClassLoader ( ); // invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 4 */
} // :goto_0
(( android.os.Parcel ) p1 ).readParcelable ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
this.d = p1;
return;
} // .end method
public androidx.recyclerview.widget.RecyclerView$y ( ) {
/* .locals 0 */
/* .line 5 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public void a ( androidx.recyclerview.widget.RecyclerView$y p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.d;
this.d = p1;
return;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
p2 = this.d;
int v0 = 0; // const/4 v0, 0x0
(( android.os.Parcel ) p1 ).writeParcelable ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
return;
} // .end method
