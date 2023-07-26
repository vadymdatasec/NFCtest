public class androidx.viewpager.widget.ViewPager$m extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/viewpager/widget/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "m" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/viewpager/widget/ViewPager$m;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer d;
public android.os.Parcelable e;
public java.lang.ClassLoader f;
/* # direct methods */
public static androidx.viewpager.widget.ViewPager$m ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/y/a/b; */
/* invoke-direct {v0}, Lc/y/a/b;-><init>()V */
return;
} // .end method
public androidx.viewpager.widget.ViewPager$m ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
/* if-nez p2, :cond_0 */
/* .line 3 */
/* const-class p2, Landroidx/viewpager/widget/ViewPager$m; */
(( java.lang.Class ) p2 ).getClassLoader ( ); // invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 4 */
} // :cond_0
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager$m;->d:I */
/* .line 5 */
(( android.os.Parcel ) p1 ).readParcelable ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
this.e = p1;
/* .line 6 */
this.f = p2;
return;
} // .end method
public androidx.viewpager.widget.ViewPager$m ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "FragmentPager.SavedState{"; // const-string v1, "FragmentPager.SavedState{"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " position="; // const-string v1, " position="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/viewpager/widget/ViewPager$m;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget v0, p0, Landroidx/viewpager/widget/ViewPager$m;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
v0 = this.e;
(( android.os.Parcel ) p1 ).writeParcelable ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
return;
} // .end method
