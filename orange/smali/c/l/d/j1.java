public class c.l.d.j1 implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Lc/l/d/j1;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public java.lang.String b;
public Integer c;
/* # direct methods */
public static c.l.d.j1 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/l/d/i1; */
/* invoke-direct {v0}, Lc/l/d/i1;-><init>()V */
return;
} // .end method
public c.l.d.j1 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.b = v0;
/* .line 3 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p1, p0, Lc/l/d/j1;->c:I */
return;
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
(( android.os.Parcel ) p1 ).writeString ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 2 */
/* iget p2, p0, Lc/l/d/j1;->c:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
