public class inal implements android.os.Parcelable$ClassLoaderCreator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Landroid/os/Parcelable$ClassLoaderCreator<", */
	 /* "Lc/j/a/c;", */
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
public c.j.a.c createFromParcel ( android.os.Parcel p0 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 6 */
	 (( c.j.a.b ) p0 ).createFromParcel ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/j/a/b;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lc/j/a/c;
} // .end method
public c.j.a.c createFromParcel ( android.os.Parcel p0, java.lang.ClassLoader p1 ) {
	 /* .locals 0 */
	 /* .line 3 */
	 (( android.os.Parcel ) p1 ).readParcelable ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
	 /* if-nez p1, :cond_0 */
	 /* .line 4 */
	 p1 = c.j.a.c.c;
	 /* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "superState must be null"; // const-string p2, "superState must be null"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.Object createFromParcel ( android.os.Parcel p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.j.a.b ) p0 ).createFromParcel ( p1 ); // invoke-virtual {p0, p1}, Lc/j/a/b;->createFromParcel(Landroid/os/Parcel;)Lc/j/a/c;
} // .end method
public java.lang.Object createFromParcel ( android.os.Parcel p0, java.lang.ClassLoader p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( c.j.a.b ) p0 ).createFromParcel ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/j/a/b;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lc/j/a/c;
} // .end method
public c.j.a.c newArray ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
/* new-array p1, p1, [Lc/j/a/c; */
} // .end method
public java.lang.Object newArray ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.j.a.b ) p0 ).newArray ( p1 ); // invoke-virtual {p0, p1}, Lc/j/a/b;->newArray(I)[Lc/j/a/c;
} // .end method
