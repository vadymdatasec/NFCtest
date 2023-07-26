public abstract class c.j.a.c implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Lc/j/a/c;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final c.j.a.c c;
/* # instance fields */
public final android.os.Parcelable b;
/* # direct methods */
public static c.j.a.c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/j/a/a; */
/* invoke-direct {v0}, Lc/j/a/a;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/j/a/b; */
/* invoke-direct {v0}, Lc/j/a/b;-><init>()V */
return;
} // .end method
public c.j.a.c ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.b = v0;
return;
} // .end method
public c.j.a.c ( ) {
/* .locals 0 */
/* .line 7 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 8 */
(( android.os.Parcel ) p1 ).readParcelable ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 9 */
} // :cond_0
p1 = c.j.a.c.c;
} // :goto_0
this.b = p1;
return;
} // .end method
public c.j.a.c ( ) {
/* .locals 1 */
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
v0 = c.j.a.c.c;
/* if-eq p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
this.b = p1;
return;
/* .line 6 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "superState must not be null"; // const-string v0, "superState must not be null"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public c.j.a.c ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lc/j/a/c;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final android.os.Parcelable a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.os.Parcel ) p1 ).writeParcelable ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
return;
} // .end method
